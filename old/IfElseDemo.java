//IfElse��䣺if(�߼����ʽ){
                 java���1..}
				 else{
				java���2...	
				 }else.....
�����ǣ����߼����ʽ��ֵΪ��ʱִ�����һ������ִ��else֮����䡣

public class IfElseDemo{ //����if else�������ɼ��ȼ�
	public static void main (String args []){
		int testscore =76;
		char grade;
		if (testscore >=90) {
			grade = 'A';
		}else if(testscore >=80){
			grade = 'B';
		}else if (testscore >=70)
		{   grade = 'C'; 
		}else if (testscore >=60)
		{   grade = 'D';
		}else{ grade ='F';
			
		}
		System.out.println("Grade=" + grade);
	}
}