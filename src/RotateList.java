/**
 * Created by mong on 1/11/17.
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int len = 1;
        ListNode tail = head;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        k = k % len;
        if(k == 0) return head;
        ListNode curr = head;
        for(int i = 0; i < k; i++){
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        tail.next = head;
        return newHead;

    }
}