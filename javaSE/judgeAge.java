import java.util.Scanner;
public class judgeAge{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);//��������¼�����
		System.out.println("������һ������ֵ");
		int age =sc.nextInt();//����һ������
		if(age <= 18){
			System.out.println("��ǰ�������������");
		}else if(age <= 28 && age >= 19){
			System.out .println("��ǰ�������������");			
		}else if(age >= 29 && age <=55){
			System.out .println("��ǰ�������������");
		}else {
			System.out .println("��ǰ�������������");
		}
	}}
	
			