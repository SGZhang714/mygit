package ���������ص�;

import java.util.Scanner;

//��ͬһ�����ж�����������Ҫ�󲻽��������������������ֵ��
// ������������С�������ֵ���Լ�����С����һ�������Ĵ�С��ϵ
public class �����ֵ���������� {
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
