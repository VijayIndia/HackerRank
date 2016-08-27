import java.util.*;
public class Panagram 
{
	Node root;
	static int count=0;
	Panagram()	
	{
		Node new_temp;
			root=new Node('A',null,null);
			Node prev_temp=root;
	 		Node temp=root;
	 		int i=66;
	    	while(i<=90)
	    	{
	    		new_temp=new Node((char)i,null,null);
	    		prev_temp.next=new_temp;
	    		prev_temp=new_temp;
	    		//temp=temp.next;
	    		i++;
	    	}
	}
	public void retrieve(Node temp)
	{
		if(temp.left!=null)
			System.out.println("temp="+temp.data+"value ="+temp.left.data);
		if(temp.next!=null)
			retrieve(temp.next);
	}
	public void str_store(char x)
	{
		Node temp=root;
		while(temp!=null && temp.data!=x )
		{
			temp=temp.next;
		}
		if(temp!=null && temp.data==x && temp.left==null)
		{
			Node new_temp=new Node(x,null,null);
			temp.left=new_temp;		   
			count++;
		}
	}
	public static void main(String[] args) 
	{
    Panagram p=new Panagram();
    Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	int i=0;
	if(str.length()<=1000 && str.length()>=1)
		{
		while(i<str.length())
		{
		char ch=str.charAt(i);
		if((int )ch <90)
			p.str_store(ch);
		else if((int)ch >90)
			{
			int ch_value=(int)ch-32;
			p.str_store((char)(ch_value));
			}
			i++;
		}
	if(count==26)
		System.out.println("pangram");
	else 
		System.out.println("not pangram");
   // p.retrieve(p.root);
		}
	}
	public static class Node
	{
		Node next,left;
		char data;
		Node(char data,Node next,Node left)
		{
			this.data=data;
			this.next=next;
			this.left=left;
		}
	}
	

}
