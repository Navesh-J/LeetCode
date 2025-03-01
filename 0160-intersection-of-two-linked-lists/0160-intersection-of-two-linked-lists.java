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
        int c1=0,c2=0;
        ListNode curr1=headA;
        ListNode curr2=headB;
        while(curr1!=null){c1++; curr1=curr1.next;}
        while(curr2!=null) {c2++; curr2=curr2.next;}
        int diff=Math.abs(c1-c2);
        ListNode currA=c1>c2?headA:headB;
        ListNode currB=c1>c2?headB:headA;
        while(diff-->0){
            currA=currA.next;
        }
        while(currA!=null && currB!=null){
            if(currA==currB){
                return currA;
            }
            currA=currA.next;
            currB=currB.next;
        }
        return null;
    }
}