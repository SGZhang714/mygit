import java.util.Scanner;
public class judgePrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);//��������¼�����
		System.out.println("������һ��������");
		int num =sc.nextInt();//����һ������
		boolean flg = true;
		for(int a = 2 ; a < num; a++){
			if(num % a == 0){
				flg = false;
			}			
		}
		if(flg){
			System.out.print(num+ "��һ������");
		}else{
			System.out.print(num+ "����һ������");
		}
		
	}}
	