import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        FileLogger logger = new FileLogger();
        Task task = new Task(logger);
        task.runTask();
    }
}

interface Logger {
    public void log(String message);
}

class FileLogger implements Logger {
    public void log(String message){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
            writer.append(message + "\n");
            writer.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}

class TerminalLogger implements Logger {
    public void log(String message){
        System.out.println(message);
    }
}

class Task {
    Logger logger;

    public Task(Logger logger){
        this.logger = logger;
    }
    public void runTask(){
        for(Integer i=0;i<10;i++){
            logger.log("Task nr " + i + " done successfully");
        }
    }
}