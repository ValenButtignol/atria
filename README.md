# repok-generator-tool

### Steps for tool usage

1. Clone the repository with its submodules
```bash
git clone --recurse-submodules https://github.com/ValenButtignol/repok-generator-tool.git 
```

2. Install `llm-repok-generator` requirements. Remember to use a virtual environment. For more details [README.md](tools/llm-repok-generator/README.md) file.
```bash
pip install -r tools/llm-repok-generator/requirements.txt
```

3. Run the following command to download javaparser inside `llm-repok-generator`:
```
wget -P tools/llm-repok-generator/tools https://repo1.maven.org/maven2/com/github/javaparser/javaparser-core/3.26.3/javaparser-core-3.26.3.jar
```

4. Install any model supported by [llama-cpp-python](https://github.com/abetlen/llama-cpp-python). For more details [README.md](tools/llm-repok-generator/README.md) file.
```
wget -P tools/llm-repok-generator/models <model_download_url>
```

5. Follow the instructions in the [README.md](tools/repok-verifier-and-injector/README.md) file to generate the repository.
