import java.security.InvalidParameterException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Animal.nr = 4;
        // System.out.println(Animal.nr);
        // Animal.getNumber();

        Animal animal1 = new Animal("Miki Hiir", 2, 2);
        // Animal.nr = 1;
        //animal1.name = "Minni Hiir";
        //animal1.age = 33;
        // animal1.age = 56;
        // animal1.nLegs = 2;
        animal1.getDescription();
        Animal animal2 = new Animal("Iiah", 5, 4);
        // Animal.nr = 2;
        // animal2.name = "Iiah";
        // animal2.age = 5;
        // animal2.nLegs = 4;
        animal2.getDescription();
        animal1.getDescription();
        // System.out.println(Animal.nr);
         System.out.println(animal2.getAge());
        ArrayList<Animal> animals = new ArrayList<Animal>();

        School smartcod = new School("smartcod", 3);
        Student ott = new Student("Ott Pikk", "some address", "ott@pikk.ee", "1234566778");
        smartcod.addStudent(ott);
        System.out.println(smartcod.getStudents());
    }
}

class Animal {
    public String name;
    private Integer age;
    public int nLegs;
    public int id;
    public static int nr = 0;



    public Animal(String name, int age, int nLegs) {
        this.name = name;
        this.setAge(age);
        this.nLegs = nLegs;
        nr++;
        this.id = nr;
    }

    public void getDescription() {
        String hello = "hello";
        System.out.printf("My name is %s and I am %d years old and I have %d legs and my number is %d\n", name, age, nLegs, id);
    }
    
    public static void getNumber(){
        
        System.out.println(Animal.nr);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age>=0){
            this.age = age;
        } else {
            throw new InvalidParameterException("Needs to have a positive number");
        }
    }

}
class School {
    private ArrayList<Student> students = new ArrayList<Student>();
    private String name;
    private int capacity;

    public School(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void addStudent(Student student) {
        if(!this.students.contains(student) && this.students.size() < capacity){
            this.students.add(student);
        }
    }
    
    public ArrayList<Student> getStudents() {
        return this.students;
    }
    public int getCapacity() {
        return this.capacity;
    }
    public String getName() {
        return this.name;
    }
}

class Student {
    private String name;
    private String address;
    private String email;
    private String idCode;

    public Student(String name, String address, String email, String idCode){
        this.name = name;
        this.address = address;
        this.email = email;
        this.idCode = idCode;
    }
}
