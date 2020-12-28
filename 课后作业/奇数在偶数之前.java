package 方法的创建和调用;

//调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
public class 奇数位于偶数之前 {
    public static void reorder(int array[]) {
        //定义两个指针，分别从前后记录数字位置
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // 找偶数
            while (start < end && array[start] % 2 != 0) {
                start++;
            }
            // 找奇数
            while (start < end && array[end] % 2 == 0) {
                end--;
            }
            // 找到后就将奇数和偶数交换位置
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
