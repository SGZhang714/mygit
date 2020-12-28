package 方法的创建和调用;

import java.util.Scanner;

//求1！+2！+3！+4！+........+n!的和
public class 求阶乘和 {
    public static int add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = 1;
            for (int j = 1; j <= i; j++) {
                tmp *= j;
            }
            sum += tmp;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(add(num));
    }
}
