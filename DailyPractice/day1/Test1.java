package DailyPractice;
import java.util.Scanner;

/*�����Ĵ�����һ�������ͷ�����һ�����ַ��������硰level�����ߡ�noon���ȵȾ��ǻ��Ĵ��������ǳ�ϲ������ӵ�жԳ����Ļ��Ĵ������յ�ʱ�����õ���������ֱ����ַ���A���ַ���B���������ǳ�������û�а취���ַ���B�����ַ���Aʹ�������ַ�����һ�����Ĵ�������ܻ��������󣬰�����Ѱ���ж����ֲ���취����ʹ�´���һ�����Ĵ�������ַ���B�����λ�ò�ͬ�Ϳ���Ϊ��һ���İ취��
���磺
A = ��aba����B = ��b����������4�ְ�B����A�İ취��

��A�ĵ�һ����ĸ֮ǰ: ��baba�� ���ǻ���
�ڵ�һ����ĸ��a��֮��: ��abba�� �ǻ���
����ĸ��b��֮��: ��abba�� �ǻ���
�ڵڶ�����ĸ��a��֮�� ��abab�� ���ǻ���
�������������Ĵ�Ϊ2
��������:
ÿ���������ݹ����С�
��һ��Ϊ�ַ���A
�ڶ���Ϊ�ַ���B
�ַ������Ⱦ�С��100��ֻ����Сд��ĸ

�������:
���һ�����֣���ʾ���ַ���B�����ַ���A֮�󹹳�һ�����Ĵ��ķ�����
* */
public class Day1A {
    //�ж��Ƿ�Ϊ���Ĵ�
    public static boolean isHuiWen(String s){
        //��������ָ�룬�ֱ��ǰ�����м������������
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            //Ƕ��if��䣬�ж��ַ��Ƿ����
            if(s.charAt(i) != s.charAt(j)){
             return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        //���ַ���B���ַ���A�ĵ�һ��λ�ÿ�ʼ���룬����trueʱ���ǻ��Ĵ�
        Scanner sc = new Scanner(System.in);
        System.out.println("����������ֻ����Сд��ĸ�ҳ���С��100���ַ���");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
//        ���������
        int count = 0;
        for(int a = 0; a < str1.length(); a++){
            StringBuilder str = new StringBuilder(str1);
            str.insert(a,str2);
            if(isHuiWen(str.toString())){
                count++;
            }
        }
        System.out.println(count);

    }
}
