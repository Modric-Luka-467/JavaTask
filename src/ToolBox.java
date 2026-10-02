import java.util.Scanner;
public class ToolBox {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("【欢迎使用多功能工具箱】");
            System.out.println("请选择功能");
            int choice = sc.nextInt();
            if (choice==1){
                System.out.print("请输入分数：");
                int score = sc.nextInt();
                String resIf;
                if (score>=90) resIf="A";
                else if (score>=80) resIf="B";
                else if (score>=70) resIf="C";
                else if (score>=60) resIf="D";
                else resIf="E";
                System.out.println("成绩评定(if-else):"+resIf);

                String resSwith;
                int level = score/10;
                switch (level){
                    case 10:
                    case 9:resSwith = "A";break;
                    case 8:resSwith = "B";break;
                    case 7:resSwith = "C";break;
                    case 6:resSwith = "D";break;
                    default:resSwith = "E";
                }
                System.out.println("成绩评定(swith):"+resSwith);
            }
            else if (choice==2){
                System.out.println("请输入金字塔层数:");
                int n = sc.nextInt();
                for (int i=1;i<=n;i++){
                    for (int k = 1;k<=n-i;k++){
                        System.out.print(" ");
                    }
                    for (int j = 1;j<=2*i-1;j++){
                        if(i == 1 || i == n || j == 1 || j == 2*i-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            else if (choice==3){
            System.out.print("计算阶乘:");
            int num = sc.nextInt();
            int result=calculateFactorial(num);
            System.out.println("计算结果:"+result);
            }
            else if (choice==4){
                System.out.println("再见");
                break;
            }
        }
        sc.close();
    }
    public static int calculateFactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*calculateFactorial(n-1);
    }
}
