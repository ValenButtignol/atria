package generator.executor;

import java.io.File;

import generator.Constants;

public class VerifierAndInjectorExecutor extends Executor {
    
    public VerifierAndInjectorExecutor(String classPath, String className, String invariantClassPath) {
        super();
        command = new String[]{
            "./gradlew",
            "run",
            "--args=" + "../../" + classPath + " " + className + " " + " " + invariantClassPath
        };

        processBuilder = new ProcessBuilder(command);
        processBuilder.directory(new File(Constants.VERIFIER_TOOL_DIR_PATH));
    }
}
