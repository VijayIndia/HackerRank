import java.util.Scanner;

/*
 * Need to add the new elements into the stack
 * While adding,if the new element is greater than the max_element ,then we need to update the maximum element
 * While the deleted element is same as the max_element,then we need to fing the new maximum element and then update it in the list 
 */
public class Maximum_element 
{
	Node root;
	static int max_element=0;
	public void push(int data)
	{
		Node new_temp=new Node(data,root);
		root=new_temp;
		if(data>max_element)
			max_element=data;
	}
	public void pop()
	{
		if(root.data==max_element)
			sort();
		root=root.next;	    
	}
	public void sort()
	{
		Node temp;
		if(root.next!=null)
			temp=root.next;
		else 
			{
			temp=null;
			}
		max_element=0;
		while(temp!=null)
		{
			if(temp.data>max_element)
			{
				max_element=temp.data;
			}
			temp=temp.next;
		}
	}
	public static void main(String[] args) 
	{
      Maximum_element m=new Maximum_element();
      Scanner s=new Scanner(System.in);
      int N=Integer.parseInt(s.nextLine());
      out:
      if(N<=100000 && N>=1)
      {
    	  while(N>0)
    	  {
    	      String x[]=s.nextLine().split(" ");
    		  switch(Integer.parseInt(x[0]))
    		  {
    		  case 1:
    			  {
    				  if(Integer.parseInt(x[1])>=1 && Integer.parseInt(x[1])<=1000000000)
    					  m.push(Integer.parseInt(x[1]));
    				  else
    					  break out;
    			  	  break;
    			  }
    		  case 2:
    		  {
    			  m.pop();
    		 	  break;
    		  }
    		  case 3:
    			  {
    				  System.out.println(max_element);
    			      break;
    			  }
    		  default:
    			  break out;    		  
    		  }
    		  N--;
    	  }
      }
    }
	public static class Node
	{
	  Node next;
	  int data;	  
	  Node(int data,Node next)
	  {
		  this.data=data;
		  this.next=next;
	  }
	}
}
