public class Product {
    private String id;
    private String name;
    private double price;

    private static int totalProductCount = 0;

    public Product(){
        totalProductCount++;
    }
    public Product(String id,String name,double price){
        this.id = id;
        this.name = name;
        this.price = price;
        totalProductCount++;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public static int getCount(){
        return totalProductCount;
    }
    public void showInfo(){
        System.out.printf("商品信息:[%s]%s,价格:%.1f元\n",id,name,price);
    }
    public static void main(String[] args){
        Product p1 = new Product("P001","机械键盘",450.0);
        Product p2 = new Product("P002","蓝牙耳机",299.0);

        p1.showInfo();
        p2.showInfo();

        System.out.println("系统当前共创建了"+Product.getCount()+"个商品实例。");
    }
}
