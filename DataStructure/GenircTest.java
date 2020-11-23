/*泛型类：class 类名 <T> ,<T>只是一个占位符，表示当前类是泛型类
意义：
1.可以进行类型的自动检查
2.自动进行类型转换
注意：
1.不能new泛型类型的数组 new T[10]
2.简单类型不能作为泛型类型参数，<包装类/类>
3.泛型类型的参数不参与类型的组成
面试问题：
  泛型是怎么编译的？
  擦除机制
 1. 泛型只存在于编译时期，运行时期没有泛型的概念
 2.泛型代码在运行期间被擦除成Object
* */
package Demo;
    class MyArrayList <T>{
        public T[] elem;//定义数组
        public int usedSize;
        public MyArrayList(){
            //实例化泛型类数组的方法是：对Object类进行强制类型转换
            this.elem = (T[]) new Object[10];
        }
        //存放泛型类数据
        public void add(T data) {
            this.elem[this.usedSize++]=data;
        }
        //返回泛型类值
        public  T getPos(int pos){
            return this.elem[pos];
        }
    }
    //接收数组
    public class GenircTest {
        public static void main(String[] args) {
            MyArrayList<String> List1 = new MyArrayList<>();
            List1.add("hello");
            List1.add("world");
            List1.add("!");
            String str = List1.getPos(2);
            System.out.println(str);
            MyArrayList<Integer> List2= new MyArrayList<>();
//       错误：MyArrayList<Int> List2= new MyArrayList<>();
            List2.add(1);
            List2.add(2);
            List2.add(3);
        }

    }


