import java.util.Scanner;
public class judgeAge{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);//创建键盘录入对象
		System.out.println("请输入一个年龄值");
		int age =sc.nextInt();//接受一个整数
		if(age <= 18){
			System.out.println("当前年龄的人是少年");
		}else if(age <= 28 && age >= 19){
			System.out .println("当前年龄的人是青年");			
		}else if(age >= 29 && age <=55){
			System.out .println("当前年龄的人是中年");
		}else {
			System.out .println("当前年龄的人是老年");
		}
	}}
	
			