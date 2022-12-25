package offer.linkedlist;

import ExistsClass.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class offer06 {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> res = new LinkedList<>();

        ListNode tmp = head;
        while(tmp != null) {
            res.push(tmp.val);
            tmp = tmp.next;
        }

        //输出
        int[] res2 = new int[res.size()];
        for (int i = 0; i < res2.length; i++) {
            res2[i] = res.pop();
        }
        return res2;
    }

    ArrayList<Integer> res =  new ArrayList<Integer>();
    public int[] reversePrintRec(ListNode head) {
        rec(head);


        int[] arr = new int[res.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

    void rec(ListNode head) {
        if(head == null)
            return;
        rec(head.next);
        res.add(head.val);
    }




    @Test
    public void testPrint() {

    }
}
