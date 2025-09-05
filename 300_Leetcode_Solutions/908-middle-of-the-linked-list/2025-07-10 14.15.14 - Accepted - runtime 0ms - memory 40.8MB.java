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
    public ListNode middleNode(ListNode head) {
          ListNode k1=head;
          ListNode k2=head;
          
          while(k1 !=null && k1.next!=null)
          {
            k2=k2.next;
            k1=k1.next.next;
          } 
          return k2;    
    }
}