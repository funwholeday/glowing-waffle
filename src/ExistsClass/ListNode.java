package ExistsClass;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int x) { val = x; }
    public ListNode(int a, int b, int c, int d, int e) {
        next.val = a;
        next.next = new ListNode(b);
        next = next.next;
        next.next = new ListNode(c);
        next = next.next;
        next.next = new ListNode(d);
        next = next.next;
        next.next = new ListNode(e);
        next = next.next;
    }

}
