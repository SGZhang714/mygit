package �����Ĵ����͵���;

//��������˳��ʹ������λ��ż��֮ǰ������֮�󣬲����Ĵ�С˳��
public class ����λ��ż��֮ǰ {
    public static void reorder(int array[]) {
        //��������ָ�룬�ֱ��ǰ���¼����λ��
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // ��ż��
            while (start < end && array[start] % 2 != 0) {
                start++;
            }
            // ������
            while (start < end && array[end] % 2 == 0) {
                end--;
            }
            // �ҵ���ͽ�������ż������λ��
            if (start < end) {
                int tmp = array[start];
                array[start] = array[end];
                array[end] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {2, 5, 6, 11, 8, 15, 9, 13, 7, 8};
        reorder(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
