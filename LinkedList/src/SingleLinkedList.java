public class SingleLinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // insertion
    void insertAtBegin(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size += 1;

        if (tail == null) {
            tail = head;
        }
    }

    void insertAtIndex(int idx, int value) {
        if (head == null) {
            insertAtBegin(value);
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size += 1;
    }

    void insertAtEnd(int value) {
        Node node = new Node(value);
        if (tail == null) {
            node.next = null;
        } else {
            tail.next = node;
        }
        tail = node;
        size += 1;
    }

    // deletion
    void deleteAtBegin() {
        head = head.next;
        size -= 1;
    }

    void deleteAtEnd() {
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size -= 1;
    }

    void deleteAtIndex(int idx) {
        Node temp = head;
        for (int i = 1; i < idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size -= 1;
    }

    // display
    void displayList(String message) {
        System.out.println(message);
        Node node = head;
        while(node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("END\n");
    }
}