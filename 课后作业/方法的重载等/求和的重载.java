package ���������ص�;

import java.util.Scanner;

//��ͬһ������,�ֱ��������������ķ��� �� ����С��֮�͵ķ����� ��ִ�д��룬������
public class ��͵����� {
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
