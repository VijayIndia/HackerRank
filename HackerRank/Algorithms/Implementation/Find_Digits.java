import java.util.Scanner;
class Testing
{
	Node root;
	int node_count=0;
	public void Initial()
	{
		root=new Node(0,null,null);
		int pre_data[]={1,2,3,4,5,6,7,8,9};
		Node temp=root,prev_temp=null;
		int count=0;
		while(count<pre_data.length)
		{
			
			prev_temp=temp;			
			temp=new Node(pre_data[count],null,null);
			prev_temp.next=temp;
			count++;
		}
	}
	public void insert()
	{
		Scanner s=new Scanner(System.in);
		int t=Integer.parseInt(s.nextLine());
		int x=0;
		out:
		while(t>=1 && t<=15)
		{
		String str=s.nextLine();
		int count=0;
		root=null;
		Initial();
		if(str.charAt(0)=='-')
				{
        	System.out.println("Inside First()");
			 		break out;
				}
        else if(str.length()>9)
        {
        	System.out.println("Inside str_length()");
        	break out;
        }
		else if(str.length()>1)
		{
			if(((Character.getNumericValue(str.charAt(0)))<0) && ((Character.getNumericValue(str.charAt(1)))<0))
				{
	        	System.out.println("Inside second()");
				break out;
				}
		}
		else if((str.length())==1)
		{
			if((Character.getNumericValue(str.charAt(0)))<=0  )
				{
				break out;
				}			
		}
		int y=Integer.parseInt(str);
		while(count<str.length() )
		{
		x=Character.getNumericValue(str.charAt(count));
		if(x!=0 && y%x==0)
			retrieve(root,x);
		count++;
		}
		print(root);
		t--;
		}
	}
	public void retrieve(Node temp,int data)
	{
		if(temp.next!=null && temp.data!=data)
		{
		retrieve(temp.next,data);		
		}
		else if(temp.data==data)
		{
		Node new_temp=new Node(data,null,null);
		while(temp.left!=null)
			temp=temp.left;
		temp.left=new_temp;
		}
	}
	public void print(Node temp)
	{
		int count=0;
        Node prev_temp=null;
		while(temp!=null)
		{
            prev_temp=temp.left;
			while(prev_temp!=null)
			{
				count++;
                prev_temp=prev_temp.left;
			}
           
			temp=temp.next;
		}
		System.out.println(count);
	}
public static void main(String args[])
   {
	Testing t=new Testing();
	t.insert();
   }
	public static class Node
	{
		int data;
		Node next,left;
	 Node(int data,Node next,Node left)
	 {
		 this.data=data;
		 this.next=next;
		 this.left=left;
	 }
	}
}
