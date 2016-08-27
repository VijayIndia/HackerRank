import java.util.Scanner;
class test
{
	Node root;
	public void push(String str)
	{
		if(root==null)
			root=new Node(str,null,null);
		else if(root!=null)
		{
			Node temp=root,new_temp=new Node(str,null,null);
			while(temp.next!=null && !(temp.data.equals(str)))
			{
				temp=temp.next;
			}
			if(temp.data.equals(str))
			{
				while(temp.left!=null)
					temp=temp.left;
			temp.left=new_temp;
			}
			else if(!(temp.data.equals(str)))
			{
				while(temp.next!=null)
					temp=temp.next;
				temp.next=new_temp;
			}
		}
	}
	public void operation(String find_str)
	{
		Node temp=root;
		int count=0;
		while(temp!=null && !temp.data.equals(find_str))
		{
			temp=temp.next;
		}
		while(temp!=null && temp.data.equals(find_str))
		{
			count++;
			temp=temp.left;
		}
		System.out.println(count);
	}
		public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			test t=new test();
			int N=Integer.parseInt(s.nextLine());
			int i=0;
			out:
			if(N>=1 && N<=1000)
			{
				while(i<N)
				{
					String x=s.nextLine();
					if(x.length()<=20)
						t.push(x);
					else
						break out;
					i++;
				}
			}
			int test=Integer.parseInt(s.nextLine());
			i=0;
			out:
			if(test>=1 && test<=1000)
			{
				while(i<test)
				{
					String x=s.nextLine();
					if(x.length()<=20)
						t.operation(x);
					else
						break out;
				i++;
				}
			}
		}
		
		public static class Node
		{
			Node next,left;
			String data;
			Node(String data,Node next,Node left)
			{
				this.next=next;
				this.left=left;
				this.data=data;
			}
		}
		
}