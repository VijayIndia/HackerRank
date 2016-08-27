Node InsertNth(Node head, int data, int position) {
   Node new_temp=new Node();
    new_temp.data=data;
    Node temp=head,prev_temp=null;
         while(position>=1 && temp.next!=null)
            {
             prev_temp=temp;
            temp=temp.next;
            position--;
            }
		if(temp==head)
		  {
		  new_temp.next=head;		  
		  head=new_temp;		  
		  }
       else if(temp!=null)
            {            
            new_temp.next=temp;            
            prev_temp.next=new_temp;
			}
 
    return head;
}