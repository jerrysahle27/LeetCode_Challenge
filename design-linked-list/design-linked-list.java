class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node(){};
        Node(int value)
        {
            val = value;
            next = null;
        }   
    }
    
    private Node head;
    public MyLinkedList() {
      head = null;
    }
    
    public int get(int index) {
        Node curr = head;
        int i = 0;
        while(curr != null && i < index){
            curr = curr.next;
            i++;
        }
      
        return (index == i && curr != null) ? curr.val : -1;
       
    }
    
    public void addAtHead(int val) {
       Node newNode = new Node(val);
       newNode.next = head;
       head = newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node curr = head;
        if(curr == null){
            addAtHead(val);
            return;
        }
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if(index == 0){
            addAtHead(val);
            return;
        }
        Node curr = head;
        int i = 0;
        while(curr != null && i < index - 1){
            curr = curr.next;
            i++;
        }
        if(curr != null)
        {
        newNode.next = curr.next;
        curr.next = newNode;
        }
    }
    
    public void deleteAtIndex(int index) {
        int i = 0;
        if(index < 0)
        {
            return;
        }
        Node curr = head;
        if(index == 0 && head != null){
            head = head.next;
            return;
        }
        while(curr.next != null && i < index - 1){
            curr = curr.next;
            i++;
        }
        if(curr != null  && curr.next != null){
             curr.next = curr.next.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */