*��д����ģ��������������ĳ����� 
 * ����������������룬������ȷ����ʾ����¼�ɹ���,
 * ������� ���������� �룬�����������
 * ���ξ�������ʾ�˳�����
*/
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
	    String  code = "980301";
	    for(int i =1; i <= 3; i++){
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������" );
	    String  password = scanner.next();
		if(password.equals (code)){
			System.out.println("��½�ɹ�");
			break;
		}else {
				System.out.println("���벻��ȷ!����������!�㻹��" + (3-i) +"�λ���");
		}
	
		
	    }	
	}
}