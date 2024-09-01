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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list3 = new ListNode();
        ListNode curr = list3;
        int carry = 0;
        List<Integer> a = new ArrayList<>();
        while (l1 != null || l2 != null) {
            int firstVal = 0;
            int secondVal = 0;
            if (l1 != null) {
                firstVal = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                secondVal = l2.val;
                l2 = l2.next;
            }
            int sum = firstVal + secondVal + carry;
            System.out.println(sum);
            if (sum >= 10) {
                int rem = sum % 10;
                carry = sum / 10;
                sum = rem;
            } else
                carry = 0;
            a.add(sum);
            if (l1 == null && l2 == null && carry == 1) {
                a.add(carry);
            }
        }

        for (int j = 0; j < a.size(); j++) {
            list3.next = new ListNode(a.get(j));
            list3 = list3.next;
        }
        return curr.next;
    }
}
