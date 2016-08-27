/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) 
{
  Node new_temp=new Node();
    new_temp.data=data;
    Node temp=head,prev_temp=head;
    if(head!=null)
        {
            while(temp!=null && data>temp.data)
                {
                    prev_temp=temp;
                    temp=temp.next;
                }
                new_temp.next=prev_temp.next;
                new_temp.prev=prev_temp;
                prev_temp.next=new_temp;
       }
    return head;
}
