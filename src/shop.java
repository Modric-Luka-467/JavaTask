public class shop {
    public static void main(String[] args){
        String name="机械键盘";
        double price=150.0;
        int stock=200;
        boolean isPromotion=false;
        int buynum=2;
        double total=price*buynum;

        boolean freeShip=total>=100 || isPromotion;
        System.out.println("商品："+name+",单价："+price+"元，促销中："+isPromotion+",购买"+buynum+"件，总价为："+total+"元");
        System.out.println("是否享受包邮："+freeShip);

        int a=10;
        int b=20;
        System.out.println("\n交换前：a="+a+",b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("交换后：a="+a+",b="+b);
    }
}
