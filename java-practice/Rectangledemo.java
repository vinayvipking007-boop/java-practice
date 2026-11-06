
class Rectangle{
    int length;
    int breadth;
    int height;
    int area(){
        return length * breadth;
    }
}
public class Rectangledemo{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 5;
        r1.height = 15;
        System.out.println("Lenght ="+r1.length);
        System.out.println("Breadth ="+r1.breadth);
        System.out.println("Area ="+r1.area());
        System.out.println("Height ="+r1.height);
    }
}

