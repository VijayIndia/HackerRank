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

Node Reverse(Node head) 
{
    Node next=null,previous=null,temp=head;
while(temp!=null)
{
	next=temp.next;
	previous=temp.prev;
	temp.next=temp.prev;
	temp.prev=next;
	if(next==null)
		head=temp;
	temp=next;
}
    return head;
}
