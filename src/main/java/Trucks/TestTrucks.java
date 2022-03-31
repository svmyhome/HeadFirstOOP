package Trucks;

public class TestTrucks {
    public static void main(String[] args) {
        Cheef cheef = new Cheef(3000);
        Truck truck = new Truck(100, 2000);
        Truck truck2 = new Truck(100, 5000);


        System.out.println("Can truck go?");
        System.out.println(cheef.canRide(truck));
        System.out.println("Can truck go?");
        System.out.println(cheef.canRide(truck2));
    }
}
