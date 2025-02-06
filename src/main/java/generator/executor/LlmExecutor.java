package generator.executor;

import java.io.File;

import generator.Constants;

public class LlmExecutor extends Executor {

    public LlmExecutor(String modelName, String promptType, String classString, String nameOfClass) {
        super();
        command = new String[]{
            "python3",
            "main.py",
            "-mn", modelName,
            "-pt", promptType,
            "-rc", classString,
            "-cn", nameOfClass
        };

        processBuilder = new ProcessBuilder(command);
        processBuilder.directory(new File(Constants.LLM_TOOL_DIR_PATH));
    }
}
