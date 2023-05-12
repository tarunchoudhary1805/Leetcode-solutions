/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1 = 0;
        int n2 = 0;
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        while(cur1 != null || cur2 != null){
             if(cur1 != null) {
           n1++;
           cur1 = cur1.next;
        } 
        if(cur2 != null) {
           n2++;
           cur2 = cur2.next;
        }
        }
        
        
        int diff = Math.abs(n1-n2);
        ListNode p1 = n1 > n2 ? headA : headB;
        ListNode p2 = (p1 == headA) ? headB : headA;
        
        for(int i=0;i<diff;i++){
            p1 = p1.next;
        }
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return p1;
        
        
    }
}