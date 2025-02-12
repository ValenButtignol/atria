# repok-generator-tool

### Steps for tool usage

1. Clone the repository with its submodules
```bash
git clone --recurse-submodules https://github.com/ValenButtignol/repok-generator-tool.git 
```

2. Download [Miniconda](https://docs.anaconda.com/miniconda/).

3. Create and activate an environment with Miniconda:
```
conda create -n <env-name>
conda activate <env-name>
```

4. Execute [dependencies.sh](dependencies.sh) to install the required dependencies.
```bash
bash dependencies.sh
```

5. Install any model supported by [llama-cpp-python](https://github.com/abetlen/llama-cpp-python). For more details [README.md](tools/llm-repok-generator/README.md) file.
```
wget -P tools/llm-repok-generator/models <model_download_url>
```

### Execute program
```
gradle run --args="<modelName> <classPath> <className>"
```

> NOTE: The `modelName` is the name of the model captured by the [ModelPathFactory](tools/llm-repok-generator/classes/factories/model_path_factory.py) If you want to test another model, you can add another option to this factory. 
>The `classPath` is the path to the class file. The `className` is the name of the class. 
