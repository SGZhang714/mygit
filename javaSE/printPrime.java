//��ӡ1��100���е�����
//�ж������������䣨1��x����û������x����
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
