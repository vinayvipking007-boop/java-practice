
    class car{
        int tyre;
        int door;
        String color;
        int model;
        public car(){
            tyre = 4;
            door = 4;
            color = "Silver";
            model = 2026;
        }
    }
    public class Class_object{
        public static void main(String[] args){
            car c1 = new car();
            c1.tyre = 4;
            c1.door = 5;
            c1.color = "Red";
            c1.model = 2026;

        System.out.println("tyre = "+c1.tyre);
        System.out.println("door = "+c1.door);
        System.out.println("color = "+c1.color);
        System.out.println("model = "+c1.model);
    }
}
    
    
