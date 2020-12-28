package 方法的重载等;

import java.util.Scanner;

//在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
public class 求和的重载 {
    public static int sum(int a ,int b){
        return a+b;
    } public static double sum(double c ,double d,double e){
        return c+d+e;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum(a,b));
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        System.out.println(sum(x,y,z));
    }
}
