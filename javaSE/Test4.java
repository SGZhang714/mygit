/*输出n*n的乘法口诀表，n由用户输入。
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
		long startTime = System.currentTimeMillis();//获取开始时间
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = scanner.nextInt();
		for (int i = 1 ; i <= num; i++) {
			for (int j = 1 ; j <= i; j++) {
				System.out.print((i + "*" + j )+ "="+ ( i*j) + " ");				
			}	
			System.out.println();
		}
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}
}