public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertFirst(12);
        list.insertFirst(15);
        list.insertLast(99);
        list.insert(20, 3);
        list.displayLL();

        System.out.println(list.deleteFirst());
        list.displayLL();

        System.out.println(list.deleteLast());
        list.displayLL();

        System.out.println(list.delete(2));
        list.displayLL();

        list.insertRec(21, 2);
        list.displayLL();

        System.out.println();

        DLL dList = new DLL();
        dList.insertFirst(2);
        dList.insertFirst(4);
        dList.insertFirst(6);
        dList.insertFirst(8);
        dList.display();

        dList.insertLast(99);
        dList.display();

        dList.insert(20, 2);
        dList.display();

        dList.insertAfterValue(6, 10);
        dList.display();

        System.out.println();

        CLL cList = new CLL();
        cList.insert(1);
        cList.insert(2);
        cList.insert(3);
        cList.insert(4);
        cList.insert(5);
        cList.display();
        cList.delete(3);
        cList.display();
    }
}