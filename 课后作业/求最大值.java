package 方法的创建和调用;

import java.util.Scanner;

//创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
//? 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
public class 求最大值 {
    public static int max2(int i, int j) {
        return Math.max(i, j);
    }

    public static int max3(int k, int l, int m) {
        int Max2 = max2(k, l);
        int Max3 = Math.max(Max2, m);
        return Max3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(max3(a, b, c));
    }
}
