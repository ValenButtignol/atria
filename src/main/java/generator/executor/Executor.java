package generator.executor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Executor {
    
    protected ProcessBuilder processBuilder;
    protected String[] command;

    public void execute() {
        try {    
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
}
