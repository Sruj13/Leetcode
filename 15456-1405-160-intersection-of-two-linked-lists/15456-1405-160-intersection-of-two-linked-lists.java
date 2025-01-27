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
        
       /* while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;*/
        
                int lena=0;
        int lenb=0;
        ListNode heada=headA;
        ListNode headb=headB;
        while(headA!=null)
        {
            lena++;
            headA=headA.next;
        }
        while(headB!=null)
        {
            lenb++;
            headB=headB.next;
        }
        ListNode curra=heada;
        ListNode currb=headb;
       if(lena>lenb)
       {
           int c=0;
           while(c<lena-lenb)
           {
               curra=curra.next;
               c++;
           }
       }
        System.out.println(lena);
         System.out.println(lenb);
        
        if(lenb>lena)
       {
           int c=0;
           while(c<lenb-lena)
           {
               currb=currb.next;
               c++;
           }
       }
        while(curra!=null)
        {
            if(curra==currb)return curra;
            curra=curra.next;
            currb=currb.next;
        }
        return null;
        
    }
}