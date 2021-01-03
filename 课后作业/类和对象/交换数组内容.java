package 类和对象;

import java.util.Arrays;

//给定两个整型数组, 交换两个数组的内容
public class 交换数组内容 {
    public static void change(int array1[], int array2[]) {
        for (int i = 0; i < array1.length; i++) {
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int array1[] = {1, 2, 3};
        int array2[] = {4, 5, 6};
        change(array1, array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));


    }
}
