package 顺序表和链表;


class Node {
    public int data;
    public Node next;

    public Node(int data) {

        this.data = data;
    }
}


public class MySignleList {
    public Node head;//定位头节点的引用

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;

    }

    //找到index-1位置节点
    public Node searchPrev(int index) {
        int count = 0;
        Node cur = this.head;
        while (count < index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        if (index < 0 || index > size()) {
            System.out.println("位置不合法");
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        Node cur = searchPrev(index);
        node.next = cur.next;
        cur.next = node;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        if (cur.next != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //找到关键字key的前驱
    public Node searchPrev2(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = searchPrev2(key);
        if (prev == null) {
            System.out.println("没有此数字");
        }
        prev.next = prev.next.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        while ((cur != null)) {
            if (cur.data == key) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }

    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //打印
    public void display() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //打印反转后的链表
    public void display2(Node newHead) {
        Node current = newHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //全部删除（只需要删除头节点，后面节点自动回收）
    //引出内存泄露问题
    public void clear() {
        this.head = null;

    }

    //反转一个单链表
    public Node reverseList() {
        Node newHead = null;
        Node prev = null;
        Node cur = this.head;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    //返回一个链表的中间节点（如果长度是偶数，返回第二个中间数）
    public Node middleNode() {
        Node slow = this.head;
        Node fast = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //输出链表的倒数第k个节点
    public Node findKthNode(int k) {
        if (k <= 0 || head == null) {
            return null;
        }
        Node slow = this.head;
        Node fast = this.head;
        for (int i = 0; i < k - 1; i++) {
            if (fast.next != null) {
                fast = fast.next;
            } else {
                System.out.println("k值不合法");
                return null;
            }
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        MySignleList mySignleList = new MySignleList();
        mySignleList.addLast(1);
        mySignleList.addLast(2);
        mySignleList.addLast(3);
        mySignleList.addLast(4);
        mySignleList.addLast(5);
        mySignleList.addLast(6);
        System.out.println(mySignleList.findKthNode(0).data);

    }
}




