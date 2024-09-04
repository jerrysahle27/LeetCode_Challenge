class Node {
    int val;
    Node next;
    Node (int value){
        next = null;
        val = value;
    }
}
class MyQueue {
    Node head;
    Node tail;
    public MyQueue() {
       
    }
    
    public void push(int x) {
        Node n = new Node(x);
        if(empty()){
            head = n;
            tail = n;
        } else {
        tail.next = n;
        tail = n;
        }
    }
    public int peek() {
        if(head != null)
          return head.val;
        else 
          return -1;
    }
    public int pop() {
        int pop = head.val;
        if(head != null){
          head = head.next;
        }
        return pop;
    }
    

    
    public boolean empty() {
        if(head == null){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */