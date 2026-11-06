public class Student_class {
    static class Student {
        int rollNumber;
        String name;
        int course;
        int section;
        Student() {
            rollNumber = 0;
            name = "Unknown";
            course = 0;
            section = 0;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNumber = 1;
        s1.name = "Student";
        s1.course = 101;
        s1.section = 5;
        System.out.println("Roll Number = " + s1.rollNumber);
        System.out.println("Name = " + s1.name);
        System.out.println("Course = " + s1.course);
        System.out.println("Section = " + s1.section);
    }
}
