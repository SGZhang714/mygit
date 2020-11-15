//输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
    import java.util.Scanner;
	public class Test {
	public static void  print (int n) {
	if(n < 0) {//当输入一个负数时，先把它变成整数。
	System.out.println("-");
	n = -n;
	  }
	if(n>9) {
	print(n/10);//递归
	}
	System.out.println(n%10);//打印个位数
	}
	  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("请输入一个整数");
	  int n = scan.nextInt();
	 print(n);
	 
	}
}