package 数组练习;

import java.util.Arrays;

//给定一个整型数组, 实现冒泡排序(升序排序)
public class 冒泡排序 {
    public static void bubbleSort(int array[]){
        for(int i = 0;i<array.length-1;i++){
            for(int j =0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[i];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {9,8,5,6,1,2 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
