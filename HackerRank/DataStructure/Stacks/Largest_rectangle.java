/*
 * To form a sorted stack in the increasing order
 * To find the adjacent element group,current_element+1=next_element,Find the number of adjacent elements
 * Generate an another stack to store the array of (current_element*no of adjacent elements) and find the maximum element
 * To find the smallest element among the adjacent group and to multiply with the no of adjacent elements
 * To 
 */
import  java.util.Scanner;
public class Largest_rectangle 
{
	Node root;
	
	public void push(int data)
	{		
		Node new_temp=null;
		if(root==null)
		{
			new_temp=new Node(data,null,null);
		}
		else if(root!=null)
		{
			new_temp=new Node(data,root,null);
			root.prev=new_temp;
		}
		root=new_temp;

	}
	
	public void operation()
	{
		Node temp=root;
		Node first_value=root,prev_value=null,sec_value=null;
		int count=1,l_count=1,max_area=0,value=0;
		while(first_value!=null)
		{
			sec_value=first_value.next;
			/* For Comparing with the prev value*/ 
				while(prev_value!=null && first_value.data<prev_value.data)
					{
					count++;
					prev_value=prev_value.prev;
					}
			prev_value=first_value;
			/* Comparison with prev_value ends*/
		if(sec_value!=null && first_value.data<sec_value.data)
		{			
			while(sec_value!=null && first_value.data<sec_value.data)
			{
				count++;
				sec_value=sec_value.next;
			}
		
		}		
		value=first_value.data*count;
		if(value>max_area)
			max_area=value;
		count=1;
		l_count=0;
		first_value=first_value.next;
		}
		System.out.println(max_area);
	}

	public static void main(String[] args) 
	{
    Largest_rectangle l=new Largest_rectangle();
    Scanner s=new Scanner(System.in);
    int N=Integer.parseInt(s.nextLine());
    out:
    	if(N>=1 && N<=100000)
    	{
    	while(N>0)
    		{
    		int x=s.nextInt();
    		if(x>=1 && x<=1000000)
    			l.push(x);
    		else 
    			break out;
    		N--;
    		}
    	l.operation();
    	}
	}
	
	public static class Node
	{
		Node next,prev;
		int data;
		Node(int data,Node next,Node prev)
		{
			this.data=data;
			this.next=next;
			this.prev=prev;
		}
	}

}
