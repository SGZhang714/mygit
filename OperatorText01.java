public class OperatorText01
{   public static void main (String args []){
	   int a=100;
	   int b=a++;
	   int c=++a;
	   System.out.println(a);
	   System.out.println(b);//++�ڱ����󣬱�ʾ�ȶ�b��ֵ��a���Լ�
	   System.out.println(c);//++�ڱ���ǰ����ʾ���Լӣ��ٶ�c��ֵ
	   /*102
	     100 
		 102 */
	   }
}