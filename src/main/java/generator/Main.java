package generator;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import generator.executor.LlmExecutor;
import generator.executor.VerifierAndInjectorExecutor;
import generator.executor.Executor;

public class Main {
    
    public static void main(String[] args) {

        if (args.length < 4) {
            throw new IllegalArgumentException("Usage: gradle run --args=<modelName> <classPath> <className> <promptType>");
        }

        String modelName = args[0];
        String classPath = args[1];
        String nameOfClass = args[2];
        String promptType = args[3];
        String classString = getClassString(classPath);
        
        Executor llmExecutor = new LlmExecutor(modelName, promptType, classString, nameOfClass);
        Executor verifierExecutor;
        
        llmExecutor.execute();
        List<String> invClassPaths = getInvClassPaths();
        System.out.println(invClassPaths);
        
        for (String invClassPath : invClassPaths) {
            verifierExecutor = new VerifierAndInjectorExecutor(classPath, nameOfClass, invClassPath);
            verifierExecutor.execute();
        }
    }

    private static String getClassString(String classPath) {
        try {
            return Files.readString(Path.of(classPath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<String> getInvClassPaths() {
        List<String> invClassPaths = new ArrayList<>();
        File directory = new File(Constants.INV_DIRECTORY_PATH);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles((dir, name) -> name.endsWith(".java"));
            if (files != null) {
                for (File file : files) {
                    String path = file.getPath();
                    path = path.replace("tools", "..");
                    
                    System.out.println("PATHS");
                    System.out.println("PATHS");
                    System.out.println("PATHS");
                    System.out.println(path);
                    System.out.println("PATHS");
                    System.out.println("PATHS");
                    System.out.println("PATHS");
                    invClassPaths.add(path);
                }
            }
        }
        
        return invClassPaths;
    }
}
