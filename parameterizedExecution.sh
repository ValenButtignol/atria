#!/bin/bash

if [ $# -lt 1 ]; then
  echo "Usage: $0 <classPath1=className1> [classPath2=className2 ... classPathN=classNameN]"
  exit 1
fi

args=("$@")

declare -A classes

for arg in "${args[@]}"; do
  IFS='=' read -r class_path class_name <<< "$arg"
  if [ -z "$class_path" ] || [ -z "$class_name" ]; then
    echo "Error: Incorrect format for class '$arg', use '<classPath>=<className>'"
    exit 1
  fi
  classes["$class_path"]="$class_name"
done

models=(
  "Qwen2.5.1-Coder"
  "Llama3.1"
  "Distill-Qwen-7b"
  "Distill-Qwen-14b"
  "Distill-Llama"
)

prompts=(
  "u-b-r" "s-b-r" "u-h-r" "s-h-r"
  "ufs-r" "uafs-r" "u-h-ufs-r" "u-h-uafs-r"
  "s-h-ufs-r" "s-h-uafs-r" "s-h-p" "s-h-uafs-p"
#  "u-h-p" "ufs-p" "uafs-p" "s-b-p"
#  "u-h-ufs-p" "u-h-uafs-p" "s-h-u-p" "u-b-p" 
)

output_dir="tools/llm-repok-generator/output"
test_dir="tools/repok-verifier-and-injector/src/test/java"
log_dir="tools/repok-verifier-and-injector/logs"

for class_path in "${!classes[@]}"; do
  class_name="${classes[$class_path]}"
  class_dir=$(dirname "$class_path")
  for model in "${models[@]}"; do
    for prompt in "${prompts[@]}"; do
    
      echo "Generating copy"
      target_dir="$class_dir/${model}_${prompt}"
      mkdir -p "$target_dir"
      cp "$class_dir"/*.java "$target_dir/"
      copied_class_path="$target_dir/$(basename "$class_path")"
    
      echo "Executing: gradle run --args=\"$model $copied_class_path $class_name $prompt\""
      gradle run --args="$model $copied_class_path $class_name $prompt"
    
      cp "$output_dir"/RepOkClass*.java "$target_dir/" 2>/dev/null
      mv "$output_dir/completions.txt" "$target_dir/" 2>/dev/null
      mkdir -p "$target_dir/tests"
      cp "$test_dir"/ErrorTest*.java "$target_dir/tests/" 2>/dev/null
      cp "$log_dir"/compile.log "$target_dir/tests/" 2>/dev/null
      cp "$log_dir"/randoop.log "$target_dir/tests/" 2>/dev/null
    done
  done
done
