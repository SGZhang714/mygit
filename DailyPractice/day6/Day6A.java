/*     A,B,C�������Ǻ�����,ÿ�������ﶼ��һЩ�ǹ�,���ǲ�֪������ÿ�������Ͼ����ж��ٸ��ǹ�,��������֪�����µ���Ϣ��

A - B, B - C, A + B, B + C. ���ĸ���ֵ.ÿ����ĸ����ÿ������ӵ�е��ǹ���.
������Ҫͨ�����ĸ���ֵ�����ÿ���������ж��ٸ��ǹ�,��A,B,C�����ﱣ֤���ֻ��һ������A,B,C������������������ 
��������:
����Ϊһ�У�һ��4���������ֱ�ΪA - B��B - C��A + B��B + C���ÿո������
��Χ����-30��30֮��(������)��

�������:
���Ϊһ�У�����������������A��B��C��˳�����A��B��C���ÿո��������ĩ�޿ո�
�������������������A��B��C�������No
��������:
1 -2 3 4
�������:
2 1 3
 * */
import java.util.Scanner;
public class test {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		//a=A-B b =B-C c=A+B d=B+C
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int A = (a+c)/2;
		int B = (b+d)/2;
		int C = (b+d)/2 -b;
		if (A - B == a && B - C == b && A + B == c && B + C == d) {
			System.out.println(A + " " + B + " " + C);
		} else {
			System.out.println("No");
		}

	}

}
