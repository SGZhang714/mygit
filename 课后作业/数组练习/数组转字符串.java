package 数组练习;

import java.util.Arrays;

//实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
// 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
public class 数组转字符串 {
    public static String toString(int array[]) {
        String ret = Arrays.toString(array);
        return ret;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 4};
        System.out.println(toString(arr));
    }
}
