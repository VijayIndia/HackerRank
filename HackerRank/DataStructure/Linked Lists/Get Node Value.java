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
    Node firstptr=head,secondptr=head;
    while(n>0 && firstptr!=null)
    {
        firstptr=firstptr.next;
        n--;
    }
    while(firstptr.next!=null)
    {
        firstptr=firstptr.next;
        secondptr=secondptr.next;
    }
    return secondptr.data;
}

