public class App {
    public static void main(String[] args) throws Exception {
        TerminalLogger logger = new TerminalLogger();
        Task task = new Task(logger);
        task.runTask();
        Cat cat = new Cat();
        System.out.println(cat+"\r\n");
    }
}