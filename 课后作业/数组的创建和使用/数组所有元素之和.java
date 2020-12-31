package 数组的创建和使用;

public class 数组所有元素之和 {
    public static int sum(int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 7, 4, 9, 6, 3};
        System.out.println(sum(arr));
    }
}
