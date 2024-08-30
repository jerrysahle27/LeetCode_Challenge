/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = findNodeLength(head) - n;
        int count = 0;
        ListNode result = head;
        ListNode curr = result;
        if(len == 0){
            return head.next;
        }
        while (head != null) {
            if (len - 1 == count) {
                if (head.next != null) {
                    head.next = head.next.next;
                }
            }  else {
                head = head.next;
            }
            result = head;
            if (result != null)
                result = result.next;
            count++;
        }
        return curr;
    }

    public int findNodeLength(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}