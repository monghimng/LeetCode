///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//public class AddTwoNumbers {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int carry = 0;
//        ListNode head = new ListNode(-1);
//        ListNode cur = head;
//        while(l1 != null || l2 != null || carry > 0){
//            int v = carry;
//            if(l1 != null){
//                v += l1.val;
//                l1 = l1.next;
//            }
//            if(l2 != null){
//                v += l2.val;
//                l2 = l2.next;
//            }
//            carry = v / 10;
//            v = v % 10;
//            cur.next = new ListNode(v);
//            cur = cur.next;
//        }
//        return head.next;
//    }
//}