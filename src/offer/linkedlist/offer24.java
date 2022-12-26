package offer.linkedlist;

import ExistsClass.ListNode;

public class offer24 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head;
        ListNode tmp = null;
        while (cur != null) {
            tmp = cur.next; // 保存下一个节点
            cur.next = pre; // 当前节点的next指向前一个
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
