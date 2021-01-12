package 每日一题;

import java.util.Scanner;

/*北京大学对本科生的成绩施行平均学分绩点制（GPA）。既将学生的实际考分根据不同的学科的不同学分按一定的公式进行计算。
 公式如下： 实际成绩 绩点 90——100 4.0 85——89 3.7 82——84 3.3 78——81 3.0 75——77 2.7 72——74 2.3 68——71 2.0 64——67 1.5 60——63 1.0 60以下 0 1．
 一门课程的学分绩点=该课绩点*该课学分 2．总评绩点=所有学科绩点之和/所有课程学分之和 现要求你编写程序求出某人A的总评绩点（GPA）。
 输入：
     5
     4 3 4 2 3
     91 88 72 69 56
 输出：2.52
 */
public class 学分绩点 {
    //求每门课程绩点
    public static double pointEachCourse(int grade) {
        double point;
        if (90 <= grade && grade <= 100) {
            point = 4.0;
        } else if (85 <= grade && grade <= 89) {
            point = 3.7;
        } else if (82 <= grade && grade <= 84) {
            point = 3.3;
        } else if (78 <= grade && grade <= 81) {
            point = 3.0;
        } else if (75 <= grade && grade <= 77) {
            point = 2.7;
        } else if (72 <= grade && grade <= 74) {
            point = 2.3;
        } else if (68 <= grade && grade <= 71) {
            point = 2.0;
        } else if (64 <= grade && grade <= 67) {
            point = 1.5;
        } else if (60 <= grade && grade <= 63) {
            point = 1.0;
        } else {
            point = 0.1;
        }
        return (double) point;
    }

    //总评绩点
    public static double gradePointAverage(int courseGreads[], int gradePoint[]) {
        int courseGreadPointTotal = 0;
        int gradePointTotal = 0;
        for (int i = 0; i < courseGreads.length; i++) {
            courseGreadPointTotal += (pointEachCourse(courseGreads[i]) * gradePoint[i]);
        }
        for (int i = 0; i < gradePoint.length; i++) {
            gradePointTotal += gradePoint[i];
        }
        return (double) courseGreadPointTotal / gradePointTotal;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            //录入学分
            int gradePoint[] = new int[n];
            for (int i = 0; i < n; i++) {
                gradePoint[i] = sc.nextInt();
            }
            //录入成绩
            int courseGreads[] = new int[n];
            for (int i = 0; i < n; i++) {
                courseGreads[i] = sc.nextInt();
            }
            //学分绩点
            double GPA = gradePointAverage(courseGreads, gradePoint);
            System.out.printf("%.2f", GPA);
        }
    }
}
