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
    public int getDecimalValue(ListNode head) {
        int res=0,count=0;
        ListNode temp=head;
        while(temp!=null){count++; temp=temp.next;}
        while(head!=null){
            count--;
            if(head.val == 1)
            res+=Math.pow(2,count);
            head=head.next;
        }
        return res;
    }
}