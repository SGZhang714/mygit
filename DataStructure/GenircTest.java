/*�����ࣺclass ���� <T> ,<T>ֻ��һ��ռλ������ʾ��ǰ���Ƿ�����
���壺
1.���Խ������͵��Զ����
2.�Զ���������ת��
ע�⣺
1.����new�������͵����� new T[10]
2.�����Ͳ�����Ϊ�������Ͳ�����<��װ��/��>
3.�������͵Ĳ������������͵����
�������⣺
  ��������ô����ģ�
  ��������
 1. ����ֻ�����ڱ���ʱ�ڣ�����ʱ��û�з��͵ĸ���
 2.���ʹ����������ڼ䱻������Object
* */
package Demo;
    class MyArrayList <T>{
        public T[] elem;//��������
        public int usedSize;
        public MyArrayList(){
            //ʵ��������������ķ����ǣ���Object�����ǿ������ת��
            this.elem = (T[]) new Object[10];
        }
        //��ŷ���������
        public void add(T data) {
            this.elem[this.usedSize++]=data;
        }
        //���ط�����ֵ
        public  T getPos(int pos){
            return this.elem[pos];
        }
    }
    //��������
    public class GenircTest {
        public static void main(String[] args) {
            MyArrayList<String> List1 = new MyArrayList<>();
            List1.add("hello");
            List1.add("world");
            List1.add("!");
            String str = List1.getPos(2);
            System.out.println(str);
            MyArrayList<Integer> List2= new MyArrayList<>();
//       ����MyArrayList<Int> List2= new MyArrayList<>();
            List2.add(1);
            List2.add(2);
            List2.add(3);
        }

    }


