#!/bin/bash

models=(
  "Qwen2.5.1-Coder"
  "Llama3.1"
  "Distill-Qwen-7b"
  "Distill-Qwen-14b"
  "Distill-Llama"
)

declare -A classes
classes=(
  ["casestudies/pli/avltree/AvlTree.java"]="AvlTree"
  ["casestudies/pli/binomialheap/BinomialHeap.java"]="BinomialHeap"
  ["casestudies/pli/hashmap/HashMap.java"]="HashMap"
  ["casestudies/pli/linkedlist/LinkedList.java"]="LinkedList"
  ["casestudies/apache/nodecachinglinkedlist/NodeCachingLinkedList.java"]="NodeCachingLinkedList"
  ["casestudies/pli/schedule/Schedule.java"]="Schedule"
  ["casestudies/pli/treemap/TreeMap.java"]="TreeMap"
)

prompts=(
  "u-b-r" "s-b-r" "u-h-r" "s-h-r"
  "ufs-r" "uafs-r" "u-h-ufs-r" "u-h-uafs-r"
  "s-h-ufs-r" "s-h-uafs-r" "u-b-p" "s-b-p"
  "u-h-p" "s-h-p" "ufs-p" "uafs-p"
  "u-h-ufs-p" "u-h-uafs-p" "s-h-u-p" "s-h-uafs-p"
)

output_dir="tools/llm-repok-generator/output"
test_dir="tools/repok-verifier-and-injector/src/test/java"

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
    
      echo "Executing: gradle run --args=\"$model $class_path $class_name $prompt\""
      gradle run --args="$model $copied_class_path $class_name $prompt"
    
      cp "$output_dir"/RepOkClass*.java "$target_dir/" 2>/dev/null
      mv "$output_dir/completions.txt" "$target_dir/" 2>/dev/null
      mkdir -p "$target_dir/tests"
      cp "$test_dir"/ErrorTest*.java "$target_dir/tests/" 2>/dev/null
    done
  done
done
