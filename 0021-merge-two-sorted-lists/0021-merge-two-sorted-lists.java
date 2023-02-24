/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //  Base Case
    if(l1 == null) return l2;
    if(l2 == null) return l1;
    
    ListNode res;
    boolean l1_is_smaller = (l1.val<l2.val);
    
    if( l1_is_smaller ){
        res = l1;   
        res.next = mergeTwoLists(l1.next,l2);
    }
    else{ 
        res = l2;   
        res.next = mergeTwoLists(l1,l2.next);
    }   
    
    return res;
    
}
    
}