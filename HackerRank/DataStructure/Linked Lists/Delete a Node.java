Node Delete(Node head, int position) 
{
    Node del_temp=null;
if(head!=null)
    {

       Node temp=head,prev_temp=head;
        while(temp.next!=null && position>0)//2>1
            {
			prev_temp=temp;
            temp=temp.next;
            position--;
            }
         if(temp!=head)  
			prev_temp.next=temp.next;        
         else if(temp==head)
             head=head.next;
     
    }
    return head;
}