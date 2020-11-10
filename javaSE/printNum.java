/求出0～999之间的所有“水仙花数”并输出。
//(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
public class printNum{
	public static void main(String[] args){
		int hundreds = 0;//定义百位数
		int decade = 0;//定义十位数
		int unit = 0;//定义个位数
		
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
