package 方法的创建和调用;

import java.util.Scanner;

//求N的阶乘
public class 求n的阶乘 {
    public static int findFac(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println(findFac(num));
    }
}
