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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp1=head;
        ListNode temp2=head;
        int sum=0;
        while(temp2.next!=null){
            temp2=temp2.next;
            sum+=temp2.val;
            if(temp2.val == 0){
                temp1.val=sum;
                if(temp2.next==null){
                    temp1.next=null;
                    break;
                }
                temp1=temp1.next;
                sum=0;
            }
        }
        return head;
    }
}