//Switch����﷨��ʽ���£�
/*Switch(�������ʽ){
	case1:�����1��break;
	case2:�����2; break;
	case2:�����3; break;
	case2:�����4; break;
	case2:�����5; break;
	defaule:
		����飻
		break;
}
�����ǣ�������ʽ��ֵ���ø�ֵ������c1��c2��c3����Ƚϣ������������֮һ����ִ��ci������飬ֱ������break��������䡣���û��ƥ��ģ���ִ��default֮�����䡣*/
//���һ���·ݵ�Ӣ������
public class SwitchDemo{
	public static void main(String args []){
		int month = 8;
		switch (month){
			case 1: System.out.println ("January"); break;
			case 2: System.out.println ("February"); break;
			case 3: System.out.println ("March"); break;
			case 4: System.out.println ("April"); break;
			case 5: System.out.println ("May"); break;
			case 6: System.out.println ("June"); break;
			case 7: System.out.println ("July"); break;
			case 8: System.out.println ("August"); break;
			case 9: System.out.println ("September"); break;
			case 10: System.out.println ("October"); break;
			case 11: System.out.println ("November"); break;
			case 12: System.out.println ("December"); break;
			default: System.out.println("û�ж�Ӧ�·ݣ�");break;


		}
		
	}
}