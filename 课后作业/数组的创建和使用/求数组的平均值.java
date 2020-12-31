package 数组的创建和使用;

//实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
public class 求数组的平均值 {
    public static int avg(int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        return count / array.length;
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 7, 4, 9, 6, 3};
        System.out.println(avg(arr));
    }
}
