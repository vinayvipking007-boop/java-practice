
public class Fooddelivery {
    static class DeliveryPartner { void deliver() { System.out.println("Food is on the way"); } }
    static class BikeDelivery extends DeliveryPartner {
        @Override void deliver() { System.out.println("Bike delivery: about 30 minutes"); }
    }
    static class DroneDelivery extends DeliveryPartner {
        @Override void deliver() { System.out.println("Drone delivery: about 15 minutes"); }
    }
    public static void main(String[] args) {
        DeliveryPartner bike = new BikeDelivery();
        DeliveryPartner drone = new DroneDelivery();
        bike.deliver();
        drone.deliver();
    }
}
