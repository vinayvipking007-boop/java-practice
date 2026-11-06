

public class Class_object {
    static class Car {
        int tyres = 4;
        int doors = 4;
        String color = "Silver";
        int model = 2026;
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.doors = 5;
        car.color = "Red";
        System.out.println("Tyres = " + car.tyres);
        System.out.println("Doors = " + car.doors);
        System.out.println("Color = " + car.color);
        System.out.println("Model = " + car.model);
    }
}
