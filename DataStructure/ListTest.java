package Demo;
/*List(����)������
.add(i):�ڶ�β����Ԫ��i
.add(a,i):��aλ�ò���Ԫ��i
.addAll(a)���ڶ�β����a�е�Ԫ��
.remove(a):�Ƴ�aλ�õ�Ԫ��
.get(a):��ȡaλ��Ԫ��
.set(a,i):��aλ��Ԫ�ظĳ�i
.size():��ȡ��Ч����
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
