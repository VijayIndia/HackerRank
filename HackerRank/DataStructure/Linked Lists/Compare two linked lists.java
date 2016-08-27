/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) 
{
    int x=3;
if(headA.next!=null && headB.next!=null && headA.data==headB.data)
    {
    x=CompareLists(headA.next,headB.next);
    }
 else if(headA.data!=headB.data)
     {
     return 0;
     }
else if(headA.next!=null)
    {
    return 0;
    }
else if(headB.next!=null)
    {
    return 0;
    }
    if(x==0)
        return x;
    else 
        return 1;
}
