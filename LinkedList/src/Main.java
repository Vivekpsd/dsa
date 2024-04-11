public class Main {
    public static void main(String[] args) {
        SingleLinkedList Slist = new SingleLinkedList();
        Slist.insertAtBegin(20);
        Slist.insertAtEnd(50);
        Slist.insertAtIndex(2, 30);
        Slist.deleteAtIndex(3);
        Slist.displayList("Single LinkedList");
        System.out.println("\nSize: " + Slist.size);

        DoubleLinkedList Dlist = new DoubleLinkedList();
        Dlist.insertAtBegin(30);
        Dlist.insertAtBegin(20);
        Dlist.insertAtBegin(10);
        Dlist.displayList();
        Dlist.displayReversedList();
        Dlist.insertAtEnd(40);
        Dlist.displayList();
        Dlist.insertAtIndex(500, 3);
        Dlist.displayList();
        Dlist.displayReversedList();
        Dlist.deleteAtIndex(3);
        Dlist.displayReversedList();
        Dlist.deleteAtEnd();
        Dlist.displayReversedList();
    }
}
