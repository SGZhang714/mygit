package 顺序表和链表;

//实现无头双向列表
class ListNode {
    public int val;
    public ListNode next;
    public ListNode prev;

    public ListNode(int val) {
        this.val = val;
    }
}

public class MyDoubleLinkedList {
    public ListNode head;
    public ListNode last;

    //头插法

    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        if (cur == null) {
            return;
        }
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        if (this.head == null) {
            return false;
        }
        while (this.head != null) {
            if (this.head.val == key) {
                return true;
            }
            this.head = this.head.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {

                if (this.head.val == key) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next == null) {
                        this.last = this.last.prev;
                    } else {
                        cur.next.prev = cur.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {

                if (this.head.val == key) {
                    if (this.head.next == null) {
                        this.head = null;
                        return;
                    }
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next == null) {
                        this.last = this.last.prev;
                    } else {
                        cur.next.prev = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        if (this.head == null) {
            return 0;
        }
        while (this.head != null) {
            this.head = this.head.next;
            count++;
        }
        return count;
    }

    public void display() {
        if (this.head == null) {
            System.out.println("当前双链表为空");
        }
        while (this.head != null) {
            System.out.print(this.head.val + " ");
            this.head = this.head.next;
        }
    }

    public void clear() {
        this.last = null;
        this.head = null;
    }

    public static void main(String[] args) {
        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();
        myDoubleLinkedList.addLast(1);
        myDoubleLinkedList.addLast(1);
        myDoubleLinkedList.addLast(1);
        myDoubleLinkedList.addLast(1);
        myDoubleLinkedList.display();
        myDoubleLinkedList.clear();
        System.out.println("1111");
    }
}

