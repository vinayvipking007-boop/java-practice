class Person {
    void display() {
        System.out.println("I am a person");
    }
}
class Student extends Person {
    void display() {
        System.out.println("I am a student");
    }
}

public class Method_overriding {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
        Student s = new Student();
        s.display();
    }
}