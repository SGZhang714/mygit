package 每日一题;

import java.util.Scanner;

/*有一只兔子，从出生后第三个月起每个月都生一只兔子，
小兔子长到第三个月后每个月又生一只兔子
，假如兔子不死，问每个月兔子总数是多少？*/
public class 统计每个月兔子的总数 {
    public static int newRabbit(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return newRabbit(num - 1) + newRabbit(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(newRabbit(n));
        }
        sc.close();
    }
}
