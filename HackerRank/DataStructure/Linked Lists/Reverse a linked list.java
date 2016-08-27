/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

//To get the next node and set it as head node

Node Reverse(Node head) // 1->2->   3-> 4 5->(2->1 3 4 5)
{
    if(head.next!=null)
        {
        Node temp=head,temp_next=head.next;
          while(temp!=null)//5!=null
            {
            temp=temp_next;//2
            temp_next=temp.next;//null
            temp.next=head;//5->4->3->2->1
            if(head.next==temp)
                head.next=null;//2->1->null
            head=temp;//4
            temp=temp_next;//5
            }         
       }
    
return head;
}
