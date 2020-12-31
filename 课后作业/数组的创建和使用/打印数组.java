package 数组的创建和使用;
//打印数组的三种方式：（1）for循环遍历（2）foreach（3）toString
import java.util.Arrays;

//实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
public class 打印数组 {
    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 7, 4, 9, 6, 3};
        //toString数组转字符串
        String ret = Arrays.toString(arr);
        System.out.println(ret);
    }
}
