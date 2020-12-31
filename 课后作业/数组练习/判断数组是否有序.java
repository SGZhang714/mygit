package 数组练习;

//给定一个整型数组, 判定数组是否有序（递增）
public class 判断数组是否有序 {
    public static boolean isSorted(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 8, 9};
        System.out.println(isSorted(arr));
    }
}