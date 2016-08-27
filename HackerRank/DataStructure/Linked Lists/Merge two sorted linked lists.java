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
    Node tempA=headA,tempB=headB,prev=null,tempB_temp=null,tempA_temp=null;
    int flag=0;
    out:
    while(tempA!=null && tempB!=null)
        {     
          tempB_temp=tempB.next;
         while(tempA!=null && tempA.data<tempB.data && flag==0)
            {
            prev=tempA;
             if(tempA.next!=null)
                   tempA=tempA.next;
             else
                 flag=1;
            }
       if(tempA.data>=tempB.data)
            {
                tempA_temp=tempA;
                tempB.next=tempA;
           if(prev!=null)     
                prev.next=tempB;           
                tempA=tempB;  
               if(tempA_temp==headA)
                 headA=tempA;
            } 
        else
           {
            tempA.next=tempB;
            break out;
            }
              tempB=tempB_temp;
       
        }
    if(tempA==null)
        return headB;
     
    return headA;
}
