/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-04-25
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        myLinkedList.display();
        System.out.println("==============");
        System.out.println();
        myLinkedList.addLast(6);
        myLinkedList.display();
        System.out.println("==============");
        System.out.println();
        System.out.println(myLinkedList.contains(6));
        System.out.println(myLinkedList.contains(9));
        System.out.println("==============");
        System.out.println();
        System.out.println(myLinkedList.size());
        System.out.println("==============");
        System.out.println();
        myLinkedList.addIndex(0,0);
        myLinkedList.display();
        myLinkedList.addIndex(7, 7);
        myLinkedList.display();
//        myLinkedList.addIndex(3,4);
//        myLinkedList.display();
        myLinkedList.remove(0);
        myLinkedList.display();
        myLinkedList.remove(7);
        myLinkedList.display();
//        myLinkedList.remove(3);
//        myLinkedList.display();
        System.out.println("==============");
        System.out.println();
//        myLinkedList.removeAllKey(1);
//        myLinkedList.display();
        myLinkedList.clear();
        myLinkedList.display();
    }
}
