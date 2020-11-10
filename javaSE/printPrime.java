//打印1到100所有的素数
//判断条件：在区间（1，x）上没有整除x的数
public class printPrime{
	public static void main(String[] args) {
		for(int i = 2 ; i <= 100 ; i++){
			boolean k = true;
			for(int j = 2; j < i ;j++){
				if(i % j == 0){
					k = false;
					break;}         
			}
			if(k){
				System.out.print(i + " ");}
		
			}	
		}
}
