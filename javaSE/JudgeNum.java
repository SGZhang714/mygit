//完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
import java.util.Scanner;
import java.util.Random;
public class judgeNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个0到10的整数");
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


	
	
		





