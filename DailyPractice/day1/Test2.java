package Demo;
/*
* ��Fibonacci���С�Fibonacci��������������ģ�

F[0] = 0 F[1] = 1 for each i �� 2: F[i] = F[i-1] + F[i-2]
��ˣ�Fibonacci���о����磺0, 1, 1, 2, 3, 5, 8, 13, ������Fibonacci�����е������ǳ�ΪFibonacci��������һ��N�����������Ϊһ��Fibonacci����ÿһ������԰� ��ǰ����X��ΪX-1����X+1�����ڸ���һ����N��������Ҫ���ٲ����Ա�ΪFibonacci����

��������������Ϊһ��������N(1 �� N �� 1,000,000)
������������һ����С�Ĳ�����ΪFibonacci��"

ʾ��1�� ����: 15
���: 2*/
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("������һ������");
        int num = sc .nextInt();
        int a = 0, b = 1, c =1;
        while(c < num){
            a = b;
            b = c;
            c = a + b;
        }
        int n1 = c - num;
        int n2 = num - b;
        System.out.println(n1 > n2? n2:n1);
    }
}
