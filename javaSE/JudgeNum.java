//��ɲ�������Ϸ ���û��������֣��жϸ������Ǵ��ڣ�С�ڣ����ǵ���������ɵ����֣����ڵ�ʱ���˳�����
import java.util.Scanner;
import java.util.Random;
public class judgeNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ��0��10������");
		int num1 = sc.nextInt();
		Random r = new Random();
		int num2 = r.nextInt(10);
		if(num1 > num2){
            System.out.print(num1 + ">" + num2);
		}else if(num1 < num2){
			System.out.print(num1 + "<" + num2);			
		}else{
			System.out.print(num1 + "=" + num2);
		}
		
		
		
	}
}


	
	
		





