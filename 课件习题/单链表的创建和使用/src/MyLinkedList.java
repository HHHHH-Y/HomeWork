import com.sun.xml.internal.ws.addressing.WsaActionUtil;

/**
 * Created with IntelliJ IDEA.
 * Description: 单链表的创建和功能的实现
 * 实现单向链表(不带傀儡节点)的代码
 * User: HHH.Y
 * Date: 2020-04-25
 */
class Node {
    public int data;
    public Node next;
    // 使用构造方法进行初始化
    public Node (int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    // 单链表在创建时就有一个head的属性
    public Node head; // 保存单链表头节点的引用, 默认为null

    // 头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        // 1. 第一次插入
        if(this.head == null) {
            this.head = node;
            return;
        }
        // 2. 不是第一次插入
        node.next = this.head;
        this.head = node;
    }

    // 打印一个单链表
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
        // 1. 第一次插入
        if(this.head == null) {
            this.head = node;
            return;
        }
        // 2. 不是第一次插入, 就需要找到最后一个节点的位置, 才可以进行插入
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    // 查找在单链表中是否包含关键字key
    public boolean contains(int key) {
        // 1. 如果单链表为空, 就不包含关键字key
        // 2. 如果不为空, 对单链表挨个进行比较, 判断是否包含key
        if(this.head == null) {
            return false;
        }
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    // 得到单链表的长度
    public int size() {
        Node cur = this.head;
        int len = 0;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }

    // 在链表的任意位置插入(第一个数据节点的下标为0)
    public void addIndex(int index, int data) {
        Node node = new Node(data);
        // 1. 在0号位置插入: 相当于头插法
        if(index == 0) {
            this.addFirst(data);
            return;
        }
        // 2. 在size号位置插入: 相当于尾插法
        if(index == this.size()) {
            this.addLast(data);
            return;
        }
        // 3. 在中间进行插入, 需要找到插入位置的前一个节点, 然后进行插入(先绑后面, 再绑前面)
        Node cur = searchIndex(index);
        node.next = cur.next;
        cur.next = node;
    }
    // 寻找插入位置的前一个节点
    private Node searchIndex(int index) {
        Node cur = this.head;
        // 让cur走index-1步
        while (index - 1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    // 删除第一次出现关键字为key的节点
    public void remove(int key) {
        // 1. 如果单链表为空, 就无法进行删除操作
        if(this.head == null) {
            return;
        }
        // 2. 如果key为第一个节点
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        // 3. 如果key不为第一个节点, 找出要删除节点的前驱, 然后进行删除
        Node prev = searchPrev(key);
        if(prev == null) {
            System.out.println("根本没有这个节点");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;
    }
    // 找删除节点的前驱
    private Node searchPrev(int key) {
        Node prev = this.head;
        while (prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    // 删除所有值为key的节点
    public void removeAllKey(int key) {
        // 1. 删除 除了头节点以外的所有值为key的节点
        Node prev = this.head; // 代表要删除节点的前驱节点
        Node cur = this.head.next; // 代表要删除的节点
        while (cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        // 2. 判断头节点是否为key, 若是, 就删掉头节点
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }

    // 清空单链表
    public void clear() {
        // 只要没有人再去引用它, 它就会被清空掉
        this.head = null;
    }
}
