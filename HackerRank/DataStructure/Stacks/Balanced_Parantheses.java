import java.util.Scanner;


public class Balanced_Parantheses //{->{->}->}
{
	Node root;
  public  void push_pop(char data)
   {
	   Node prev=null;
	   Node new_temp=new Node(data,null);
	   if(root==null)
	   {
		   root=new_temp;
	   }
	   else if (root!=null)
	   {
		   Node temp=root;
		   while(temp.next!=null)
		   {
			   prev=temp;
			   temp=temp.next;
		   }
		     if((temp.data+1)==new_temp.data||(temp.data+2)==new_temp.data)
			  {
			   if(root==temp && temp.next==null)
                  {
				   root=null;
                  }
			   else
			   {
				   prev.next=null;
			   }
			   temp=null;
			  }
		   else
			   {
			   temp.next=new_temp;
			   }

	   }
   }  
	
	public static void main(String[] args) 
	{
       Scanner s=new Scanner(System.in);
       Balanced_Parantheses b=new Balanced_Parantheses();
       int T=Integer.parseInt(s.nextLine());
       while(T>0)
       {
    	   String str=s.nextLine();
    	   char ch[]=str.toCharArray();
    	   for(int i=0;i<str.length();i++)
    		   {
    		   b.push_pop(ch[i]);
    		   }
    	   if(b.root!=null)
    		   System.out.println("NO");
    	   else
    		   System.out.println("YES");
    	   b.root=null;
    	   T--;
       }
	}
	public static class Node
	{
		
		Node next;
		char data;

		Node(char data,Node next)
		{
			this.data=data;
			this.next=next;
		}
	}
	

}
