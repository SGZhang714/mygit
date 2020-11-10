public class OperatorText01
{   public static void main (String args []){
	   int a=100;
	   int b=a++;
	   int c=++a;
	   System.out.println(a);
	   System.out.println(b);//++在变量后，表示先对b赋值，a在自加
	   System.out.println(c);//++在变量前，表示先自加，再对c赋值
	   /*102
	     100 
		 102 */
	   }
}