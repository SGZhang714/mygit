//����һ���������������������
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num = input.nextInt();
        while(num!=0){
            System.out.print(num%10);
            num=num/10;
        }
    }
}