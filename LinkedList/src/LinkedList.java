public class LinkedList {
    private class Node {
        private int data;
        private Node next;

        public Node (int data) {
            this.data = data;
        }

        public Node (int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList () {
        this.size = 0;
    }

    public void insertAtBegin(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertAtIndex(int val, int index) {
        if (index == 0) {
            insertAtBegin(val);
            return;
        }
        if (index == size) {
            insertAtEnd(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertAtEnd(int val) {
        if (tail == null) {
            insertAtBegin(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteAtBegin() {
        int val = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteAtEnd() {
        Node secondLast = get(size - 2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteAtBegin();
        }
        if (index == size) {
            return deleteAtEnd();
        }
        Node prev = get(index - 1);
        int val = prev.next.data;
        prev.next = prev.next.next;

        return val;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if(node.data == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
