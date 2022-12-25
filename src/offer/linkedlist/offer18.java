package offer.linkedlist;

import ExistsClass.ListNode;
import org.junit.Test;

public class offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode node = head;
        ListNode pre = head;

        if(head.val == val) return head.next;
        while(node != null) {
            if(node.val == val) {
                pre.next = node.next;
                break;
            } else {
                pre = node;
                node = node.next;
            }
        }
        return head;
    }

    @Test
    public void test(){
        ListNode head = new ListNode();
        head.val=-3;
        head.next = new ListNode(5);
        head.next.next = new ListNode(10);

        deleteNode(head, -3);

        while (head!=null) {
            System.out.println(head.val + ",");
            head = head.next;
        }

    }
}
