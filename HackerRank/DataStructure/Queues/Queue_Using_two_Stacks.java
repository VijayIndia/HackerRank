import java.util.Scanner;

public class Queue_Using_two_Stacks 
{

	public static void main(String[] args) 
	{
		Queue_Using_two_Stacks q=new Queue_Using_two_Stacks();
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());		
		Queue root=null,temp;
		while(n>0 && n<=100000)
		{
			int b=0,a;
			String input=s.nextLine();
			String input_splitup[]=input.split(" ");
			   a=Integer.parseInt(input_splitup[0]);
            if(a>3 || a<1)
             break;
			if(input_splitup.length==2)
            {
                b=Integer.parseInt(input_splitup[1]);
                if(b>1000000000 || b<1)
                    break;
            }
			
            if(a==1)
			{
				if(root==null)
					root=new Queue(b,null,null);
				else if(root!=null)
					{
					if(root.prev==null)
						{
						temp=new Queue(b,root,root);
						root.next=temp;
						root.prev=temp;
						}
					else if(root.prev!=null)
						{
						temp=new Queue(b,root,root.prev);
						root.prev.next=temp;
						root.prev=temp;
						}
					}
			}
			else if(a==2)//
			{
				Queue temp_next=root.next;//
				Queue temp_prev=root.prev;	
				if(temp_next==temp_prev)
					{
					root=temp_next;
					if(temp_next!=null)
						{
						root.next=null;
						root.prev=null;
						}
					}
				else if(temp_prev!=null && temp_next!=null)
			   {
				temp_prev.next=temp_next;
				temp_next.prev=temp_prev;
				root=temp_next;			
			   }			  
			}
			else if(a==3)
			{				
				System.out.println(root.data);
			}
           }
           n--;
		
	}
public static class Queue
	{
	int data;
	Queue next,prev;
	Queue(int data,Queue next,Queue prev)
	{
		this.data=data;
		this.next=next;
		this.prev=prev;
	}
	}
}
