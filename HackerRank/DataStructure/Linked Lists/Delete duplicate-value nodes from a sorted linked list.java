/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head)
{
  Node temp=head,temp_next=head.next;
    while(temp_next!=null)
    {
        if(temp.data!=temp_next.data)
               {
                temp=temp.next;
               }
         else 
              {
                temp.next=temp.next.next;
              }
          temp_next=temp.next;
    }
    return head;
}
