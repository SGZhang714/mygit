import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
        //�����������������Լ��
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������������");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
   
        for(int i = Math.min(num1, num2);i > 0;i--) {
            if(num2 % i == 0 && num1 % i == 0) {
                System.out.println("���������������Լ����" + i);
                break;
            }
        }
        }