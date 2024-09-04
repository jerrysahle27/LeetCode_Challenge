/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = null;
        ListNode oddP = odd;
        ListNode even = null;
        ListNode evenP = even;
        ListNode curr = head;
        int i = 0;
        while(curr != null){
            i++;
            ListNode newNode = new ListNode(curr.val);
            if(i %2 == 1){
                if(oddP == null){ 
                    oddP = newNode;
                    odd = oddP;
                } else {
                    oddP.next = newNode;
                    oddP = oddP.next;
                }
            }
            else if(i % 2 == 0){
                if(evenP == null){
                evenP = newNode;
                   even = evenP;
                } else {
                    evenP.next = newNode;
                    evenP = evenP.next;
                }
            }
            curr = curr.next;
        }
        if(oddP == null){
            return even;
        } else {
          oddP.next = even; 
          return odd;
        }
    }
}