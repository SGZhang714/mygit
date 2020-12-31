package 方法的创建和调用;

import java.util.Scanner;

//求斐波那契数列的第n项。(迭代实现)
public class 斐波那契数 {
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
