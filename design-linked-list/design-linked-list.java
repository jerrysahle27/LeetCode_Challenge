class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node(int value) {
            val = value;
            next = null;
        }
    }

    private Node head;

    public MyLinkedList() {
        head = null; // Initialize head as null for an empty list
    }

    public int get(int index) {
        Node current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        return (current != null) ? current.val : -1; // Return -1 if index is out of bounds
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) return; // Invalid index
        Node newNode = new Node(val);
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0) return; // Invalid index
        if (index == 0 && head != null) {
            head = head.next;
            return;
        }
        Node current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
    }
}