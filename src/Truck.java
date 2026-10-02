public class Truck extends TransportVehicle implements GPSLocatable{
    public Truck(String vehicleId){
        super(vehicleId);
    }
    public double calculateCost(double weight){
        return weight * 5.0;
    }
    public String getLocation() {
        return "仓库A区";
    }
}
