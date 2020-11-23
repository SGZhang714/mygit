package DailyPractice;
import java.util.Scanner;

/*“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。花花非常喜欢这种拥有对称美的回文串，生日的时候她得到两个礼物分别是字符串A和字符串B。现在她非常好奇有没有办法将字符串B插入字符串A使产生的字符串是一个回文串。你接受花花的请求，帮助她寻找有多少种插入办法可以使新串是一个回文串。如果字符串B插入的位置不同就考虑为不一样的办法。
例如：
A = “aba”，B = “b”。这里有4种把B插入A的办法：

在A的第一个字母之前: “baba” 不是回文
在第一个字母‘a’之后: “abba” 是回文
在字母‘b’之后: “abba” 是回文
在第二个字母’a’之后 “abab” 不是回文
所以满足条件的答案为2
输入描述:
每组输入数据共两行。
第一行为字符串A
第二行为字符串B
字符串长度均小于100且只包含小写字母

输出描述:
输出一个数字，表示把字符串B插入字符串A之后构成一个回文串的方法数
* */
public class Day1A {
    //判断是否为回文串
    public static boolean isHuiWen(String s){
        //定义两个指针，分别从前后向中间遍历整个链表
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            //嵌套if语句，判断字符是否相等
            if(s.charAt(i) != s.charAt(j)){
             return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        //将字符串B从字符串A的第一个位置开始插入，返回true时即是回文串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个只包含小写字母且长度小于100的字符串");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
//        定义计数器
        int count = 0;
        for(int a = 0; a < str1.length(); a++){
            StringBuilder str = new StringBuilder(str1);
            str.insert(a,str2);
            if(isHuiWen(str.toString())){
                count++;
            }
        }
        System.out.println(count);

    }
}
