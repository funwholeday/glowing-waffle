package offer.linkedlist;

import ExistsClass.ListNode;

public class offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head, slow = head;

        //快节点
        for(int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}