/*
  Insert Node at the beginning of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int x) 
{
    Node new_temp=new Node();
    new_temp.data=x;
    new_temp.next=null;
if(head==null)
    {
    head=new_temp;    
    }
    else if(head!=null)
     {
      new_temp.next=head;
       head=new_temp;
    }
    return head;
}
