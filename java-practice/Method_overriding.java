public class Method_overriding {
    static class Person { void display() { System.out.println("I am a person"); } }
    static class Student extends Person { @Override void display() { System.out.println("I am a student"); } }
    public static void main(String[] args) {
        Person p = new Person(); p.display();
        Person s = new Student(); s.display();
    }
}
