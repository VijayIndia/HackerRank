import java.util.Scanner;
public class Swap_Nodes 
{	
	 Node root;
	public void insert()
	{		
	 Scanner s=new Scanner(System.in);
     int N=Integer.parseInt(s.nextLine());	
     int N_copy=N;
     root=new Node(1,null,null);
	 Node temp=root;//queue
	 Node temp1=root;//Tree
	 Node temp_ptr=root;//pointer to queue
     if(N>=1 && N<=1024)
     {
	 while(N_copy>0)
	 	{
		 Node new_left=null,new_right=null;
		 String a[]=s.nextLine().split(" ");
		 new_left=new Node(Integer.parseInt(a[0]),null,null);
		 if(a.length>1)
		   new_right=new Node(Integer.parseInt(a[1]),null,null);
		 if(new_left.data!=-1 && new_left.data>=2 && new_left.data<=N)
			 {
			 temp1.left=new_left;
			 temp.next=new_left;
			 temp=temp.next;
			 }
		 else if(new_left.data==-1)
			 temp1.left=null;
		 if(new_right.data!=-1 && new_right.data>=2 && new_right.data<=N)
		 	{
			 temp1.right=new_right;
			 temp.next=new_right;
			 temp=temp.next;
		 	}
		 else if(new_right.data==-1)
			 temp1.right=null;
			 temp_ptr=temp_ptr.next;
		 temp1=temp_ptr;
		 N_copy--; 
	 	}
	     int x=Integer.parseInt(s.nextLine());
    	 //retrieve(root);
    	 //retrieve(root);

	     while(x>=1 && x<=100)
	    	 {
	    	 int y=Integer.parseInt(s.nextLine());
             //System.out.println("N="+N);        	 
             if(y>=1 && y<=N)
             {
                  //  System.out.println("y="+y);        	 
                    int height_left=height_left(root);
                    int height_right=height_right(root);
	    	        int height=(height_left>=height_right?height_left:height_right);
                    //System.out.println("height="+height+"height_left="+height_left+"height_right="+height_right);
	    	        int i=1;
	    	    	// System.out.println("after height"+height);

	    	        while(height>0)
	    	            {
	               	// System.out.println("b4 swap");
	    		         swap(root,y*i);
	    		         i++;
	    		         height--;
	    	            }
	   	     //System.out.println("x="+x);
	    	 retrieve(root);
	    	 System.out.println();
             }
	    	 x--;
	    	 }
     }    
    }
	public int height_left(Node temp)
	{
		if(temp.left!=null && temp.right!=null)
			return Math.max(height_left(temp.left)+1,height_left(temp.right)+1);
		else if(temp.left!=null)
			return height_left(temp.left)+1;
		else if(temp.right!=null)
			return height_left(temp.right)+1;
		else
			return 1;
	}
    public int height_right(Node temp)
	{
		if(temp.right!=null)
			return height_right(temp.right)+1;
		else if(temp.left!=null)
			return height_right(temp.left)+1;
		else
			return 1;
	}
	public void swap(Node temp,int z)
	{
		
		if(temp.left!=null && z>1)
			swap(temp.left,z-1);		
		if(temp.right!=null && z>1)
			swap(temp.right,z-1);
	if(z==1)
	{
		Node temporary=temp.right;
		temp.right=temp.left;
		temp.left=temporary;		
	}
		
	}
	public void retrieve(Node temp)
	{
		if(temp.left!=null)
			retrieve(temp.left);
		System.out.print(temp.data+" ");
		if(temp.right!=null)
			retrieve(temp.right);
	}

	public static void main(String[] args) 
	{
		Swap_Nodes s=new Swap_Nodes();
		s.insert();     
	}
	public static class Node
	{
	Node left,right,next;
	int data;
	Node(int data,Node left,Node right)
		{
		this.data=data;
		this.left=left;
		this.right=right;		
		}
		Node(int data,Node next)
		{
		this.next=next;
		}
	}
}
