//��ȡһ�������������������е�ż��λ������λ�� �ֱ��������������
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("���������֣�");
        int value=scan.nextInt();
        System.out.println("ż�����У�");
        for(int i=31;i>0;i-=2){
            System.out.print((value>>i)&1);
        }
        System.out.println("");
        System.out.println("�������У�");
        for(int i=30;i>=0;i-=2){
            System.out.print((value>>i)&1);
        }
    }
}