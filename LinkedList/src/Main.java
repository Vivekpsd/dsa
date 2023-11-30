public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(60);
        list.insertAtIndex(50, 4);
        System.out.println(list.deleteAtBegin() + " deleted.");
        System.out.println(list.deleteAtEnd() + " deleted.");
        System.out.println(list.deleteAtIndex(0) + " deleted.");
        list.display();

    }
}
