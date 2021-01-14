package 每日一题;

import java.util.Scanner;

//输入一个正整数n，再输入n个数字各不相同，再输入一个x，输出x在这个数组中的下标（如果不在，输出-1）
public class 找x {
    public static int findX(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
            ;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (sc.hasNextInt()) {
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            int ret = findX(array, x);
            System.out.println(ret);
        }
    }
}
