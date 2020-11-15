*编写代码模拟三次密码输入的场景。 
 * 最多能输入三次密码，密码正确，提示“登录成功”,
 * 密码错误， 可以重新输 入，最多输入三次
 * 三次均错，则提示退出程序
*/
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
	    String  code = "980301";
	    for(int i =1; i <= 3; i++){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入密码" );
	    String  password = scanner.next();
		if(password.equals (code)){
			System.out.println("登陆成功");
			break;
		}else {
				System.out.println("密码不正确!请重新输入!你还有" + (3-i) +"次机会");
		}
	
		
	    }	
	}
}