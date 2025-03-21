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
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode first=head;
        ListNode second=head.next;
        while(second != null){
            ListNode temp=new ListNode(gcd(first.val,second.val));
            first.next=temp;
            temp.next=second;
            first=first.next.next;
            second=second.next;
        }
        return head;
    }
}