import java.util.Calendar;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Kaspar", LocalDate.of(1993, 03, 21));
        System.out.println(student.getBirthDate());
        student.setMissedClasses(10);
        System.out.println(student.getMissedClasses());

        Person parent = new Person("Martin", LocalDate.of(1993, 03, 21));
        student.sayHelloToStudent();

        FirstYearStudent firstYearStudent = new FirstYearStudent("Manivald", LocalDate.of(1993, 03, 21));
        System.out.println(firstYearStudent.getBirthDate());
        firstYearStudent.setMissedClasses(10);
        System.out.println(firstYearStudent.getMissedClasses());
        firstYearStudent.sayHelloToStudent();
        
        Teacher teacher = new Teacher("Kaspar Martin", LocalDate.of(1993, 03, 21), 1100);
        Teacher teacher2 = new Teacher("Kaspar Martin", LocalDate.of(1993, 03, 21), 1100);
        Teacher teacher3 = new Teacher("Kaspar Martin", LocalDate.of(1993, 03, 21), 1100);
        System.out.println(teacher.getName());
        System.out.println(teacher.getSalary());
    }
}

class Person {
    protected String name;
    private LocalDate birthdate;

    public Person(String name, LocalDate birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName(){
        return name;
    }
    
    public LocalDate getBirthDate(){
        return birthdate;
    }
}

class Student extends Person {
    private Integer missedClasses;

    public Student(String name, LocalDate birthdate){
        super(name, birthdate);
    }

    public void sayHelloToStudent(){
        System.out.println("Hello " + name);
    }

    public Integer getMissedClasses(){
        return missedClasses;
    }

    public void setMissedClasses(Integer missedClasses){
        this.missedClasses = missedClasses;
    }
}

class FirstYearStudent extends Student {
    public FirstYearStudent(String name, LocalDate birthdate){
        super(name, birthdate);
    }
}

class Teacher extends Person {
    private Integer salary;

    public Teacher(String name, LocalDate birthdate, Integer salary){
        super(name, birthdate);
        this.salary = salary;
    }
    
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}