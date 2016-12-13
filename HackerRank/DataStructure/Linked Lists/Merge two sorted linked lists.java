/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
Node MergeLists(Node headA, Node headB) 
    {
        if(headA==null && headB==null)
            return null;
        if(headA==null)
                return headB;
        else if(headB==null)
                return headA;            
        if(headA.data<=headB.data)
            headA.next=MergeLists(headA.next,headB);
        if(headB.data<headA.data)
           {
               headB.next=MergeLists(headA,headB.next);
               headA=headB;
           }
         return headA;
    }
