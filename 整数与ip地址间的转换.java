package 每日一题;

import java.util.Scanner;

/*原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成一个长整数。
举例：一个ip地址为10.0.3.193
每段数字             相对应的二进制数
10                   00001010
0                    00000000
3                    00000011
193                  11000001
组合起来即为：00001010 00000000 00000011 11000001,转换为10进制数就是：167773121，即该IP地址转换后的数字就是它了。
每段可以看成是一个0-255的整数，需要对IP地址进行校验

输入描述：

输入
1 输入IP地址 10.0.3.193
2 输入10进制型的IP地址 167969729

输出描述：

输出
1 输出转换成10进制的IP地址 167773121
2 输出转换后的IP地址 10.3.3.193*/
public class 整数与ip地址间的转换 {
    //IP转十进制整数
    public static Long IpToTen(String ip){

        String[] arr = ip.split("\\.");

        long n = Long.parseLong(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            n <<= 8;
            n += Long.parseLong(arr[i]);

        }
        return n;
    }


    //十进制数转IP
    public static String TenInToIp(Long num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num >>> 24);
        sb.append(".");
        sb.append((num >>> 16) & 0xff);
        sb.append(".");
        sb.append((num >>> 8) & 0xff);
        sb.append(".");
        sb.append(num & 0xff);
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String IP = sc.nextLine();
            Long decimalIP = sc.nextLong();
            Long ret1 = IpToTen(IP);
            String ret2 = TenInToIp(decimalIP);
            System.out.println(ret1);
            System.out.println(ret2);
        }
    }
}
