import java.util.Scanner;
public class judgePrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);//创建键盘录入对象
		System.out.println("请输入一个正整数");
		int num =sc.nextInt();//接受一个整数
		boolean flg = true;
		for(int a = 2 ; a < num; a++){
			if(num % a == 0){
				flg = false;
			}			
		}
		if(flg){
			System.out.print(num+ "是一个素数");
		}else{
			System.out.print(num+ "不是一个素数");
		}
		
	}}
	