public class DoubleLinkedList {

    Node head = null;
    Node tail = null;
    int size = 0;

    class Node {
        private int value;
        private Node next;
        private Node prev;

        Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        Node(int value, Node prev) {
            this.value = value;
            this.prev = prev;
            this.next = null;
        }

        Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public void displayList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("END\n");
    }

    public void displayReversedList() {
        Node node = tail;
        while (node != null) {
            System.out.print(node.value + " <- ");
            node = node.prev;
        }
        System.out.print("START\n");
    }

    public void insertAtBegin(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
        size += 1;
    }

    public void insertAtIndex(int value, int idx) {
        Node node = new Node(value);
        Node temp = head;
        for (int i = 1; i < idx - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next.prev = node;
        node.prev = temp;
        temp.next = node;
        size += 1;
    }

    public void insertAtEnd(int value) {
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size += 1;
    }

    public void deleteAtBegin() {
        if (head != null) {
            head = head.next;
            head.prev = null;
            size -= 1;
        } else {
            System.out.println("Empty List");
        }
    }

    public void deleteAtIndex(int index) {
        Node temp = head;
        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }
        Node ahead = temp.next.next;
        ahead.prev = temp;
        temp.next = ahead;
        size -= 1;
    }

    public void deleteAtEnd() {
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size -= 1;
    }
}
