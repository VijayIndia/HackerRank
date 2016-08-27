/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) 
{
    Node tempA=null,tempB=null;
    if(headA!=null && headB!=null && headA.next!=null && headB.next!=null)
        {
            tempA=headA.next;
            tempB=headB.next;
        }
    while(tempB!=null)
        {
            tempA=headA.next;
            while(tempA!=null && tempA!=tempB)
            {
              tempA=tempA.next;
             }
             if(tempA==tempB)
                 {
                  return tempA.data;
                  }
         tempB=tempB.next;
        }
    return 0;
}
