pip install -r tools/llm-repok-generator/requirements.txt

wget -P tools/repok-verifier-and-injector/tools https://github.com/randoop/randoop/releases/download/v4.3.2/randoop-all-4.3.2.jar

./tools/repok-verifier-and-injector/gradlew build
