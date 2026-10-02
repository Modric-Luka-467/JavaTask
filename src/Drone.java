public class Drone extends TransportVehicle implements GPSLocatable{
    public Drone(String vehicleId){
        super(vehicleId);
    }
    public double calculateCost(double weight){
        return weight * 15.0;
    }
    public String getLocation(){
        return "高空坐标(39.9,116.4)";
    }
}
