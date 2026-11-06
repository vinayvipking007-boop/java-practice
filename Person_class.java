class Person{
private String name;
private int age;
Person(String name, int age){
this.name = name;
this.age = age;
}
void display(){
System.out.print("Name:"+name);
System.out.print("Age:"+age);
}
}
class Student extends Person{
     int rollNumber;
    Student(String name, int age, int rollNumber){
        super(name, age);
        this.rollNumber = rollNumber;
    }
}
class Person_class{
    public static void main(String[] agrs){
   Student s1 = new Student("Priyanka",18,19 );
   s1.display();
    }
}