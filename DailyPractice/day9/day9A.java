import java.util.Scanner;
//����һ��������n����n�Ľ׳�ĩβ�ж��ٸ�0
/*��ĩβ����0���Ϳ�������м���10���ӣ�10=5*2��
�������õ��Ľ��2�ĸ���һ������5�ĸ���������ֻ��Ҫ��5�ĸ����Ϳ����ˡ�
���Ǿ���25�������֣������Ա�5�����Σ���������Ҫ��ѭ���г���5�����ѳ�5�ĸ����ۼӾͿ����ˡ�*/
public class TestClass {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            n /= 5;
            cnt += n;
        }
        System.out.println(cnt);
    }
}

