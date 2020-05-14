package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-05-13
 */
public class TestMain {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.display();
        System.out.println("=============");
       /* System.out.println(myLinkedList.contains(1));
        System.out.println("=============");
        System.out.println(myLinkedList.size());
        System.out.println("=============");*/
        myLinkedList.addIndex(0,0);
        myLinkedList.display();
        myLinkedList.addIndex(6, 7);
        myLinkedList.display();
        myLinkedList.addIndex(6, 6);
        myLinkedList.display();
        System.out.println("==============");
        myLinkedList.removeKey(0);
        myLinkedList.display();
        myLinkedList.removeKey(7);
        myLinkedList.display();
        myLinkedList.removeKey(6);
        myLinkedList.display();
        System.out.println("===============");
        myLinkedList.clear();
        myLinkedList.display();
    }
}
