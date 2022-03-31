package Trucks;

public class Cheef {
    int weight;

    public Cheef(int weight) {
        this.weight = weight;
    }

    public boolean canRide(Truck truck) {
        if (weight >= truck.weight){
            return true;
        }
        else {
            return false;
        }
    }
}
