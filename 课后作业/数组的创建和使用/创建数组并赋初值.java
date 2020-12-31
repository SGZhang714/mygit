package 数组的创建和使用;

//创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
public class 创建数组并赋初值 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }
}
