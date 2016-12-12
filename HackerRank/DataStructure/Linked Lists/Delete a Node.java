Node Delete(Node head, int position) 
{
    Node temp=head,del_next=head;
     if(position==0)
     {
         head=head.next;
         return head;
     }
   while(position>1)
   {
       temp=temp.next;
       position--;
   }
   
    del_next=temp.next.next;
    temp.next=del_next;
    return head;
}
