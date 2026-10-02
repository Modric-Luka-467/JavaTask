public abstract class TransportVehicle {
    protected String vehicleId;

    public TransportVehicle(String vehicleId){
        this.vehicleId = vehicleId;
    }

    public abstract double calculateCost(double weight);
}
