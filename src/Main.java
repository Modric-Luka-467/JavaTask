//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args){
        TransportVehicle truck = new Truck("T-998");
        TransportVehicle drone = new Drone("D-007");
        double weight = 10;

        GPSLocatable truckGPs = (GPSLocatable)truck;
        GPSLocatable droneGPs = (GPSLocatable)drone;
        System.out.printf("卡车[%s]当前位置:%s | 配送%.0fkg货物费用:%.1f元\n",truck.vehicleId,truckGPs.getLocation(),weight,truck.calculateCost(weight));
        System.out.printf("无人机[%s]当前位置:%s | 配送%.0fkg货物费用:%.1f元\n",drone.vehicleId,droneGPs.getLocation(),weight,drone.calculateCost(weight));


        StorageBox<Product> productBox = new StorageBox<>();
        StorageBox<TransportVehicle> deviceBox = new StorageBox<>();
        Product product = new Product("P001","机械键盘",299.0);
        TransportVehicle droneDevice = new Drone("D-007");
        productBox.storeItem(product);
        deviceBox.storeItem(droneDevice);
        Product getProduct = productBox.retrieveItem();
        TransportVehicle getDevice = deviceBox.retrieveItem();
        System.out.println("\n商品储物箱存取测试:成功取出商品 ->"+getProduct.getName());
        System.out.println("设备储物箱存取测试:成功取出设备 ->无人机["+getDevice.vehicleId+"]");

        MyArrayList<String>list=new
                MyArrayList<>();
        list.add("单号A");
        list.add("单号B");
        list.add("单号C");
        list.add("单号D");
        list.add("单号E");
        System.out.println("\n获取索引[2]的元素:"+list.get(2));
        list.remove(1);
        System.out.println("验证移位，此时索引[1]的元素变为了:"+list.get(1));

        LogisticsConfig a=LogisticsConfig.getInstance();
        LogisticsConfig b=LogisticsConfig.getInstance();
        System.out.println("单例测试:配置类实例A与实例B是否相同? ->"+(a==b));
        TransportVehicle vehicle = VehicleFactory.createVehicle("Drone");
        System.out.print("工厂调度:工厂成功分配 ->");
        double cost = vehicle.calculateCost(10);
        System.out.println("无人机["+vehicle.vehicleId+"],计费启动...");
        LogisticsOrder order = new LogisticsOrder.Builder("0D-999").sender("Alice").receiver("Bob").fragile(true).insureMoney(1000.0).build();
        System.out.println(order);
    }
}