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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode res = new ListNode(0);
        ListNode test = res;
        
        while(true)
        {
            if(list1==null)
            {
                test.next=list2;
                break;
            }
            if(list2==null)
            {
                test.next=list1;
                break;
            }
            if(list1.val<=list2.val)
            {
                test.next=list1;
                list1=list1.next;
            }
            else
            {
                test.next=list2;
                list2=list2.next;
            }
            test=test.next;
        }
        return res.next;
        
    }
}