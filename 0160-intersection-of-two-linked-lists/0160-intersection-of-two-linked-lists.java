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
        Set<ListNode> set=new HashSet<>();
        for(ListNode curr=headA;curr!=null;curr=curr.next){
            set.add(curr);
        }
        for(ListNode curr=headB;curr!=null;curr=curr.next){
            if(set.contains(curr))
                return curr;
        }
        return null;
    }
}