package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-05-13
 */
class Node {
    public int data;
    public Node prev;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;
    public Node end;

    //  头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        // 1. 第一次插入
        if(this.head == null) {
            this.head = node;
            this.end = node;
            return;
        }
        // 2. 不是第一次插入
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }

    // 打印双链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    // 尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        // 第一次插入
        if(this.head == null) {
            this.head = node;
            this.end = node;
            return;
        }
        // 不是第一次插入
        this.end.next = node;
        node.prev = this.end;
        this.end = node;
    }

    // 查找在链表中是否包含关键字key
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    // 求出链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    private void judgeIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index位置不合法");
        }
    }
    // 在任意位置插入, 开始的下标索引为0
    public void addIndex(int index, int data) {
        // 1. 判断index位置是否合法
        judgeIndex(index);
        // 2. index位置合法之后才可以进行插入
        if(index == 0) {
            // 如果插入到0号位置, 相当于是头插法
            addFirst(data);
            return;
        }
        if(index == size()) {
            // 如果插入到最后一个位置, 相当于是尾插法
            addLast(data);
            return;
        }
        Node cur = this.head;
        for (int i = index; i > 0; i--) {
            cur = cur.next;
        }
        Node node = new Node(data);
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }

    // 删除第一次出现关键字key的节点, 删完就返回
    public void removeKey(int key) {
        Node cur = this.head; // cur 表示为当前需要删除的节点
        while (cur != null) {
            // 如果cur的值恰好等于key的值
            if(cur.data == key) {
                // 1. 如果要删除的恰好是头节点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    // 2. 如果要删除的节点不是头节点
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.end = cur.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
    }

    // 删除所有值为key的节点
    public void removeAll(int key) {
        Node cur = this.head; // cur 表示为当前需要删除的节点
        while (cur != null) {
            // 如果cur的值恰好等于key的值
            if(cur.data == key) {
                // 1. 如果要删除的恰好是头节点
                if(cur == this.head) {
                    this.head = this.head.next;
                    if(this.head != null) {
                        this.head.prev = null;
                    }
                } else {
                    // 2. 如果要删除的节点不是头节点
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.end = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    // 清空链表
    public void clear() {
        while (this.head != null) {
            Node cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.end = null;
    }
}
