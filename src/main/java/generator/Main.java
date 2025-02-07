package generator;

import java.nio.file.Files;
import java.nio.file.Path;

import generator.executor.LlmExecutor;
import generator.executor.VerifierAndInjectorExecutor;
import generator.executor.Executor;

public class Main {
    
    public static void main(String[] args) {

        String modelName = "Llama3.2";
        String classPath = "LinkedList.java";
        String nameOfClass = "LinkedList";
        String promptType = "dual-w";
        String classString = getClassString(classPath);
        String specClassPath = getSpecClassPath(promptType);

        Executor llmExecutor = new LlmExecutor(modelName, promptType, classString, nameOfClass);
        Executor verifierExecutor = new VerifierAndInjectorExecutor(classPath, nameOfClass, promptType, specClassPath);

        llmExecutor.execute();
        verifierExecutor.execute();
    }

    private static String getClassString(String classPath) {
        try {
            return Files.readString(Path.of(classPath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getSpecClassPath(String promptType) {
        switch (promptType) {
            case Constants.GLOBAL_PROMPT_TYPE:
                return Constants.REPOK_CLASS_PATH;
            case Constants.FS_W_PROMPT_TYPE:
                return Constants.REPOK_CLASS_PATH;
            case Constants.FS_P_PROMPT_TYPE:
                return Constants.REPOK_CLASS_PATH;
            case Constants.DUAL_W_PROMPT_TYPE:
                return Constants.PROPERTIES_CLASS_PATH;
            case Constants.DUAL_P_PROMPT_TYPE:
                return Constants.PROPERTIES_CLASS_PATH;
            default:
                return null;
        }
    }
}
