public class VehicleFactory {
    public static TransportVehicle createVehicle(String type){
        if("Truck".equals(type)){
            return new Truck("T-001");
        }
        else if ("Drone".equals(type)){
            return new Drone("D-007");
        }
        return null;
    }
}
