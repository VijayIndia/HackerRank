import java.util.*;
public class Waiter 
{
    Node root,root1;//root for stack to perform operations and root1 to Maintain list of items
    Node left_ptr,right_ptr,temp;
    int root_count=0,root1_count=0;
    static int count=0;
	public Node push()/*Node to create only normal stack with empty data*/
	{		
	  if(root==null)/*For Creating the number count=1*/
	  {
		  root=new Node(count,null,null);
	  }
	  else if(root!=null)
	  {		  
	  	Node new_temp=new Node(count,root,null);//1
	  	root=new_temp;
	  }
	  count++;
	  return root;
	}
	public void push_data(Node temp,int data)
	{
	     /*After the node with count is created,then inorder to insert values to that count node*/ 
	      Node new_temp=new Node(data,null,temp.left);
		  temp.left=new_temp;	  
	}
	public void perform_operation(int x)
	{
		left_ptr=push();//left_ptr=root;//Negative will be root
		right_ptr=push();//right_ptr=root.next;//Positive will be next to root
		temp=left_ptr.next;//temp will be the ordinary array
		while(temp.left!=null)
		{
			temp=temp.left;
			if(temp.data%x==0)
			{
				Node new_temp=new Node(temp.data,null,right_ptr.left);
				right_ptr.left=new_temp;
			}
			else
			{
				Node new_temp=new Node(temp.data,null,left_ptr.left);
				left_ptr.left=new_temp;
			}
		}
		pop();
		
	}
	public void pop()
	{
		Node temp=root.next;
		root.next=root1;
		root1=root;
		//log.debug();
		root=temp;
	}
	public void reverse_pop()
	{
		Node temp=root1,temp1=null;
		while(temp.next!=null)
		{
		temp1=temp.next;//
		temp.next=root;
		root=temp;
		temp=temp1;
		}
		temp1.next=root;
		root=temp1;
	}
	public void answer_generator()
	{
		Node temp=root.left;
		while(temp!=null)
		{
		System.out.println(temp.data);
		temp=temp.left;
		}
		temp=root.next; 
		while(temp!=null)
		{
			Node new_temp=temp.left;
			while(new_temp!=null)
			{
			System.out.println(new_temp.data);
			new_temp=new_temp.left;
			}
			temp=temp.next;
		}
	}
	/*Needed to implement Prime number generator*/
	 public int prime_generator(int n)//3
	{		 
		 for (int i = n; i >0; i++)         
			 
		 	{ 		  	  
			 int counter=0; 	  
			 for(int num =i; num>=1; num--)
			 	{
				 	if(i%num==0)
				 		{
				 			counter = counter + 1;
				 		}
			 	}
			 if (counter ==2)
			 	{
				 	return i;
			 	}	
		 	}
		 return 1200;
		}
	public static void main(String[] args) 
	{
       Waiter w=new Waiter(); //Pass the count and receive the node.
	   w.push();
	   Scanner s=new Scanner(System.in);
	   String str[]=s.nextLine().split(" ");
	   int x=Integer.parseInt(str[0]);
       int y=Integer.parseInt(str[1]);
        if(x>=1 && x<=50000 && y<=1200 && y>=1)
            {
	           String no[]=s.nextLine().split(" ");
	           int i=0;
	           while(x>0)
	               {
                      int z=Integer.parseInt(no[i]);
		              if(z>=2 && z<=10000)
                           w.push_data(w.root,z);		            
                      i++;
		              x--;
	               }
	           int j=2;
	           while(y>0)
	               {	
		              w.perform_operation(j);//Need to generate prime number
		              j=w.prime_generator(j+1);//Need to  add this
		              y--;
	               }
	           w.pop();
	           w.root=null;
	           w.reverse_pop();
	           w.answer_generator();
	           }
    }
	public static class Node
	{
		Node next,left;
		int data;
		Node(int data,Node next,Node left)
		{
			this.data=data;
			this.next=next;
			this.left=left;
		}
	}

}
