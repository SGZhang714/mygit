package 数组练习;

import java.util.Arrays;

//实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
public class 数组的拷贝 {
    public static String copyOf(int array[]) {
        int array1[] = Arrays.copyOf(array, array.length);
        return Arrays.toString(array1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 5};
        System.out.println(copyOf(arr));
    }
}
