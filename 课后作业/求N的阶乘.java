package �����Ĵ����͵���;

import java.util.Scanner;

//��N�Ľ׳�
public class ��n�Ľ׳� {
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
