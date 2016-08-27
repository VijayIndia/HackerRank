/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) 
{
    int count=0;
    Node temp=head;
while(temp.next!=null)
    {
    count++;
    temp=temp.next;
    }
    count=count-n;
    temp=head;
while(count>0)
    {
    temp=temp.next;
    count--;
    }
    return temp.data;
}
