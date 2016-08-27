/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head)//temp=1->3 6 6  temp_next=1
{
Node temp=head;
    if(temp!=null)
    {
    while(temp.next!=null)
        {
          Node temp_next=temp.next;
          if(temp_next.data==temp.data)
              {
              temp.next=temp_next.next;
              }
          else
              {
              temp=temp.next;
              }
        }
    }
    return head;
}
