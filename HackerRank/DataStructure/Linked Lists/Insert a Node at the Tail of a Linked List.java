/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data)
{
    Node new_temp=new Node();
    new_temp.data=data;
    new_temp.next=null;
    if(head==null)
        {
        head=new_temp;
        }
    else if(head!=null)
        {
        Node temp=head;
        while(temp.next!=null)
            {
            temp=temp.next;
            }
        if(temp.next==null)
            {
            temp.next=new_temp;
            }
        }   
    return head;
}
