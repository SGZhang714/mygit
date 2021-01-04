package 顺序表和链表;

//实现顺序表代码
public class MyArrayList {
    public int[] elem;
    public int usedsize;

    public MyArrayList(int capacity) {
        this.elem = new int[capacity];
        this.usedsize = 0;
    }

    //在pos位置新增元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > this.usedsize) {
            System.out.println("位置不合法");
            return;
        }
        if (this.usedsize == this.elem.length) {
            System.out.println("顺序表为满");
            return;
        }
        for (int i = this.usedsize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedsize++;
    }

    //打印顺序表
    public void print() {
        for (int i = 0; i < this.usedsize; i++) {
            System.out.print(this.elem[i] + " ");
        }
    }

    //判断是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.elem.length; i++) {
            if (toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedsize; i++) {
            if (toFind == this.elem[i]) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (pos < 0 || pos > this.usedsize) {
            System.out.println("位置不合法");
            return -1;
        }
        return this.elem[pos];
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (pos < 0 || pos > this.usedsize) {
            System.out.println("位置不合法");
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = search(toRemove);
        if (index == -1) {
            System.out.println("没有关键字" + toRemove);
            return;
        }
        for (int i = index; i < this.usedsize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedsize--;
    }

    // 获取顺序表长度
    public int size() {
        return this.usedsize;
    }

    // 清空顺序表
    public void clear(int toRomve) {
        for (int i = 0; i < 5; i++) {
            remove(toRomve);
        }

    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(5);
        myArrayList.add(0, 1);
        myArrayList.add(0, 1);
        myArrayList.add(0, 1);
        myArrayList.add(0, 1);
        myArrayList.add(0, 2);

        myArrayList.clear(1);
        myArrayList.print();

    }
}
