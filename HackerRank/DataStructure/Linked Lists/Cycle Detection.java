/*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) 
{
Node temp=head;
    int count=0;
    if(temp!=null)
    {
    while(temp.next!=null && count<=100) 
        {
        temp=temp.next;
        count++;
        }
    if(count>100)
        {
        return 1;
        }
    }
    return 0;
}
