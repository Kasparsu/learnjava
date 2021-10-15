import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

class FileLogger implements Logger {
    public void log(String message){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
            writer.append(message + "\n");
            writer.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}