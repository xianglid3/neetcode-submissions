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
    public ListNode reverseList(ListNode head) {
        
        // 1 , 2 => 2, 1
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        while(curr != null){  
            //cur = 1 
            // next = 2
            next = curr.next; 

            //1 -> 2, now 1 -> null
            curr.next = prev;

            //null -> 1 
            prev = curr;

            //curr = 2
            curr = next;

            



        }

        return prev;

    }
}
