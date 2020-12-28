package 方法的重载等;

import java.util.Scanner;

//在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
// 还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
public class 求最大值方法的重载 {
    public static int max(int a,int b){
        return Math.max(a,b);
    }
    public static double max(double c,double d){
        return Math.max(c,d);
    }
    public static double max(double e,double f,int j ){
        double tmp = e>f? e:f;
        double max = tmp>j? tmp:j;
        return  max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(max(a,b));
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        System.out.println(max(x,y));
        double i=sc.nextDouble();
        double j=sc.nextDouble();
        int k=sc.nextInt();
        System.out.println(max(i,j,k));
    }

}
