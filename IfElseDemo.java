//IfElse语句：if(逻辑表达式){
                 java语句1..}
				 else{
				java语句2...	
				 }else.....
含义是：当逻辑表达式的值为真时执行语句一，否则执行else之后语句。

public class IfElseDemo{ //利用if else语句输出成绩等级
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