package �����Ĵ����͵���;

import java.util.Scanner;

//���������������������ֵmax2�������дһ����3���������ֵ�ĺ���max3��
//? Ҫ����max3��������У�����max2��������ʵ��3���������ֵ����
public class �����ֵ {
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
