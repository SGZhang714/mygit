/*���n*n�ĳ˷��ھ���n���û����롣
 * 1*1=1
 * 2*1=2 2*2=4
 * 3*1=3 3*2=6 3*3=9
 * ..........
 * 9*1=9 9*2=18 9*3=27 9*4=36 ..... 9*9=81
 * n*1=n n*2=2n.....                n*n=n2
 */
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();//��ȡ��ʼʱ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������");
		int num = scanner.nextInt();
		for (int i = 1 ; i <= num; i++) {
			for (int j = 1 ; j <= i; j++) {
				System.out.print((i + "*" + j )+ "="+ ( i*j) + " ");				
			}	
			System.out.println();
		}
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");    //�����������ʱ��
	}
}