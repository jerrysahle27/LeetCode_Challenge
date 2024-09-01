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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        ListNode curr = list3;
        List<Integer> a = new ArrayList<>();
        while (list1 != null || list2 != null) {
            if (list1 != null) {
                a.add(list1.val);
                list1 = list1.next;
            }
            if (list2 != null) {
                a.add(list2.val);
                list2 = list2.next;
            }
        }
        Collections.sort(a);
        for (int j = 0; j < a.size(); j++) {
            list3.next = new ListNode(a.get(j));
            list3 = list3.next;
        }
        return curr.next;
    }
}