package 数组练习;
//给定一个有序整型数组, 实现二分查找
public class 二分查找 {
    public static int binarySerach(int []array ,int key){
        int left = 0;
        int right = array.length -1;
        while(left<=right){
            int mid = (right+left)/2;
            if(key<array[mid]){
               right = mid-1;
            }
             else if(key>array[mid]){
                 left = mid +1;
            }else {
                 return mid;
            }
        }
        return -1;//表示没有找到
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        System.out.println(binarySerach(arr,1));
    }
}
