package Demo;
/*List(链表)方法：
.add(i):在队尾插入元素i
.add(a,i):在a位置插入元素i
.addAll(a)：在队尾插入a中的元素
.remove(a):移除a位置的元素
.get(a):获取a位置元素
.set(a,i):将a位置元素改成i
.size():获取有效数字
*/
import java.util.ArrayList;
import java.util.List;
public class listTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2,99);
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        list.add(99);
        list2.addAll(list);
        System.out.println(list2);
        System.out.println("size:" + list2.size());
        System.out.println(list2.remove(2));
        System.out.println("size:" + list2.size());
    }
}
