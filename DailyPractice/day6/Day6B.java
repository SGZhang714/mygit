import java.util.Scanner;
/*
 * ����n��������������ִ������ڵ������鳤��һ�������
��������:
ÿ�������������n���ո�ָ��n��������n������100��������һ��
�������ִ������ڵ���n/2��
�������:
������ִ������ڵ���n/2������

ʾ��1 �������ʾ���������ԣ���̨�������ݰ㲻����ʾ��
����
3 9 3 2 5 6 7 3 2 3 3 3
���
3*/
public class test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //���ַ�����Ϊ�ַ����飬�����ո�ȥ��
        String[] s = str.split(" ");
        Integer[] arr = new Integer[s.length];
        //���ַ�����תΪInteger���͵�����
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int len = arr.length / 2;
        //����һ������Ϊ100�����飬Ȼ�����arr���飬
        //��arr�������ֵ��a���±��Ӧ�������ͬ���ͽ�a�����ֵ++��
        //������a���飬�ҵ��������������֣������ӡ������
        int[] a = new int[100];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (arr[i] == j) {
                    a[j]++;
                }
            }
        }
        int ret = 0;
        for (int j = 0; j < a.length; j++) {
            if (len <= a[j]) {
                ret = j;
            }
        }
        System.out.println(ret);
    }}