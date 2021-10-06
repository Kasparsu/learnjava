import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World!");
        System.out.println(
            "Integer:" + 10 +
            " Double:" + 3.14 + 
            " Boolean:" + true);
        System.out.print("Hello ");
        System.out.print("World!\n");
        System.out.printf("Pi = %.4f other number: %d\n", Math.PI, 123);
        System.out.println("Enter name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Enter number:");
        try {
        int num = scanner.nextInt();
        /* 
        
        im a block comment
        
        */
        //float floatNum = scanner.nextFloat();
        System.out.println("You entered: " + name + " and " + num);
        System.out.printf("You entered: %s and %d\n", name, num);
        } catch(Exception e) {
            System.out.println("Invalid input");
        }
        String number = "134";
        int num = Integer.parseInt(number);
        System.out.println(num);

        if(num < 100){
            System.out.println("smaller");
        } else if (num == 100){
            System.out.println("equals");
        } else {
            System.out.println("bigger");
        }
        num = 5;
        switch(num){
            case 1:
                System.out.println("one");
                break;
            case 2:
            case 3:
                System.out.println("two or three");
                break;
            default:
                System.out.println("something else");
                break;
        }

        String word = num < 5 ? "väiksem" : "suurem v v6rdne";
        System.out.println(word);
        sayHello("Kaspar", 12);
        sayHello();
    }

    public static void sayHello() {
        System.out.println("Hello Unknown");
    }

    public static void sayHello(String name, int age) {
        System.out.println("Hello " + name + " you are " + age + " years old");
    }
}
