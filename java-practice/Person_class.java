public class Person_class {
    static class Person {
        private String name;
        private int age;
        Person(String name, int age) { this.name = name; this.age = age; }
        void display() { System.out.println("Name: " + name); System.out.println("Age: " + age); }
    }
    static class Student extends Person {
        int rollNumber;
        Student(String name, int age, int rollNumber) {
            super(name, age);
            this.rollNumber = rollNumber;
        }
        void displayStudent() { display(); System.out.println("Roll Number: " + rollNumber); }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Student", 18, 19);
        s1.displayStudent();
    }
}
