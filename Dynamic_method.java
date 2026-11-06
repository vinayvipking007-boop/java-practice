class p{
    void display(){
        System.out.println("P's display");
    }
    void eat(){
    System.out.println("P is eating ");
}
}
class c extends p{
    void display(){
        System.out.println("C's display");
    }
    void eat(){
    System.out.println("C is walking ");
    }
}
public class Dynamic_method {
    public static void main(String [] args){
        p p1 = new c();
         p1.display();
         p1.eat();
    } 
}
