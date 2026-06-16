package WEEK3.DAY2;

import WEEK3.DAY2.mergeLL.ListNode;

public class removeNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode temp = new ListNode(0);
     temp.next = head;
     ListNode slow = temp;
     ListNode fast = temp;
     for(int i =1;i<=n+1;i++){
        fast = fast.next;
     }  
     while(fast != null){
        fast = fast.next;
        slow = slow.next;
     } 
     if(slow.next != null){
        slow.next = slow.next.next;
     }
     return temp.next;

    }
    
}
