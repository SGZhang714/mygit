package �����Ĵ����͵���;

import java.util.Scanner;

//��쳲��������еĵ�n�(����ʵ��)
public class 쳲������� {
    public static int fib(int num){
        if (num == 1 || num == 2) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));


    }
}
