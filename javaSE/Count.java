///¼ÆËã1/1-1/2+1/3-1/4+1/5 ¡­¡­ + 1/99 - 1/100 µÄÖµ ¡£
public class Count{
	public static void main(String[] args){
		int a = 1;
		double sum = 0;
		for(int b =1 ; b <= 100; b++){
			sum += 1.0 / b * a;
			a = -a;
		}
		System.out.print(sum);
	}
}