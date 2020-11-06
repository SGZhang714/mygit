//Switch语句语法格式如下：
/*Switch(整数表达式){
	case1:语句组1；break;
	case2:语句组2; break;
	case2:语句组3; break;
	case2:语句组4; break;
	case2:语句组5; break;
	defaule:
		语句组；
		break;
}
语意是：计算表达式的值，用该值依次与c1、c2、c3、相比较，如果等于其中之一，则执行ci的语句组，直到遇到break跳出此语句。如果没有匹配的，则执行default之后的语句。*/
//输出一个月份的英文名称
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
			default: System.out.println("没有对应月份！");break;


		}
		
	}
}