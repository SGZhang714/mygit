/���0��999֮������С�ˮ�ɻ������������
//(��ˮ�ɻ�������ָһ����λ�������λ���ֵ�������ȷ�õ��ڸ����� ���磻153��1��5��3?����153��һ����ˮ�ɻ���������
public class printNum{
	public static void main(String[] args){
		int hundreds = 0;//�����λ��
		int decade = 0;//����ʮλ��
		int unit = 0;//�����λ��
		
		for(int i = 100; i < 1000; i++){
			hundreds = i / 100;
			decade = i % 100 / 10;
			unit = i % 10;

			if (i == (hundreds*hundreds*hundreds + decade*decade*decade + unit*unit*unit))
			{
			 System.out.print( i + " ");			
		}
	}
}}
