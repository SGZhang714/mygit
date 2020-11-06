public class IntTypeText
{  
	public static void main (String  args []){
	   int a=10;
	   int b=0101;//以0开头数字默认为八进制
       int c=0x10;//以0x开头数字默认为十六进制
		  
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
       System.out.println(a+b+c);

       
}
}