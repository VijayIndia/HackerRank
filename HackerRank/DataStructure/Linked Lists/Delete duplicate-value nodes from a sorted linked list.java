/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head)
{
  Node temp=head,temp_next=null;
    if(temp!=null)
    {
        temp_next=temp.next;
    while(temp_next!=null)
        {
          if(temp.data==temp_next.data)
              {
              temp.next=temp_next.next;
              }
          else
              temp=temp.next;
           temp_next=temp_next.next;
        }
    }
    return head;
}
