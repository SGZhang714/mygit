
//有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
public class 题目1 {
    public static int findNum( int ayyay[]){
        for (int i = 0; i < ayyay.length; i++) {
            int count = 0;//每次进入外层循环将计数器归零
            for (int j = 0; j < ayyay.length; j++) {
                if (i == j){
                    continue;//跳出i=j的选项，执行下一次循环，避免每次都有一个相同数
                }
                if(ayyay[i]==ayyay[j]){
                    count++;
                    break;
                }
            }
            if(count==0)
                return ayyay[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,3,1,2,5};
        System.out.println(findNum(arr));
    }
}





