//���һ��������ÿһλ���磺123��ÿһλ��1 �� 2 �� 3
    import java.util.Scanner;
	public class Test {
	public static void  print (int n) {
	if(n < 0) {//������һ������ʱ���Ȱ������������
	System.out.println("-");
	n = -n;
	  }
	if(n>9) {
	print(n/10);//�ݹ�
	}
	System.out.println(n%10);//��ӡ��λ��
	}
	  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("������һ������");
	  int n = scan.nextInt();
	 print(n);
	 
	}
}