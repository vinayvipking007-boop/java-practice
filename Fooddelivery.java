class DeliveryPartner{
  void Deliveryfood(){
        System.out.println("Estimated delivery time ");
    }
}
class BikeDelivery extends DeliveryPartner{
    void BikeDeliveryfood(){
    System.out.println("Estimated delivery time is 30 minutes");
   }
}
class DroneDelivery extends DeliveryPartner{
     void DroneDeliveryfood(){
        System.out.println("Estimated delivery time is 15 minutes");
    }
}
public class Fooddelivery {
    public static void main(String [] args){
 DeliveryPartner dp = new DeliveryPartner();
 dp.Deliveryfood();
 BikeDelivery b1 = new BikeDelivery();
 b1.BikeDeliveryfood();
 DroneDelivery d2 = new DroneDelivery();
 d2.DroneDeliveryfood();

    }
    
}
