package 数组的创建和使用;
//实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
// 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
public class 改变数组元素的值 {
    public static void transform(int array[]) {
        for (int i = 0; i < array.length; i++) {
              array[i]*=2;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 7, 4, 9, 6, 3};
        transform(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

    }
}
