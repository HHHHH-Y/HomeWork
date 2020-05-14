package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-05-13
 */
public class TestMain {
    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.addAtIndex(0, 10);
        myLinkList.print();
        myLinkList.addAtIndex(0, 20);
        myLinkList.print();
        myLinkList.addAtIndex(1,30);
        myLinkList.print();
        System.out.println(myLinkList.get(0));
//        myLinkList.deleteAtIndex(0);
//        System.out.println(myLinkList.get(0));
    }
}
