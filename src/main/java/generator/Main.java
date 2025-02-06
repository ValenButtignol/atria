package generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Main {
    
    private static final String PYTHON_PATH = "python3";
    private static final String SCRIPT_PATH = "tools/llm-repok-generator/main.py";
    private static final String OUTPUT_TYPE = "console";

    public static void main(String[] args) {

        String modelName = "Llama3.2";
        String classPath = "LinkedList.java";
        String nameOfClass = "LinkedList";
        String classString = "public class LinkedList {\n" + //
                        "\n" + //
                        "    private static class Node {\n" + //
                        "\n" + //
                        "        int data;\n" + //
                        "\n" + //
                        "        Node next;\n" + //
                        "\n" + //
                        "        Node(int data) {\n" + //
                        "            this.data = data;\n" + //
                        "            this.next = null;\n" + //
                        "        }\n" + //
                        "    }\n" + //
                        "\n" + //
                        "    private Node head;\n" + //
                        "\n" + //
                        "    private int size;\n" + //
                        "\n" + //
                        "    public LinkedList() {\n" + //
                        "        head = null;\n" + //
                        "        size = 0;\n" + //
                        "    }\n" + //
                        "\n" + //
                        "    public void add(int data) {\n" + //
                        "        Node newNode = new Node(data);\n" + //
                        "        if (head == null) {\n" + //
                        "            head = newNode;\n" + //
                        "        } else {\n" + //
                        "            Node current = head;\n" + //
                        "            while (current.next != null) {\n" + //
                        "                current = current.next;\n" + //
                        "            }\n" + //
                        "            current.next = newNode;\n" + //
                        "        }\n" + //
                        "        size++;\n" + //
                        "    }\n" + //
                        "\n" + //
                        "    public int remove() {\n" + //
                        "        if (head == null) {\n" + //
                        "            throw new IllegalStateException(\"List is empty\");\n" + //
                        "        }\n" + //
                        "        int removedData = head.data;\n" + //
                        "        head = head.next;\n" + //
                        "        size--;\n" + //
                        "        return removedData;\n" + //
                        "    }\n" + //
                        "}\n" + //
                        "";
        String promptType = "fs-w";

        String specClassPath = "../llm-repok-generator/output/RepOkClass.java";

        String[] command = buildGeneratorCommand(modelName, classString, nameOfClass, promptType);
        command = buildVerifierAndInjectorCommand(classPath, nameOfClass, promptType, specClassPath);
        
        execute(command);

    }

    public static void execute(String[] command) {

        try {
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            processBuilder.directory(new File("tools/repok-verifier-and-injector"));
            
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            process.waitFor();
            
        } catch (Exception e) {
            System.out.println("Error executing command: " + e.getMessage());   
        }
    }

    private static String[] buildGeneratorCommand(String modelName, String classString, String nameOfClass, String promptType) {
        return new String[] {
            PYTHON_PATH,
            SCRIPT_PATH,
            "-mn", modelName,
            "-pt", promptType,
            "-rc", classString,
            "-cn", nameOfClass,
            "-ot", OUTPUT_TYPE
        };
    }

    // Must execute the verifier and injector with "./repok-verifier-and-injector/gradlew run --args="<classPath> <className> <promptType>""
    private static String[] buildVerifierAndInjectorCommand(String classPath, String className, String promptType, String specClassPath) {
        return new String[] {
            "./gradlew",
            "run",
            "--args=" + "../../" + classPath + " " + className + " " + promptType + " " + specClassPath
        };
    }

}
