import java.util.Scanner;
public class Cut_The_Sticks 
{
	Node root;
	int N;
   public void Merge_sort(int x)
   {
	   Node temp=root,prev_temp=null;
	   if(temp.data<x)
	   	{
		   while(temp!=null && temp.data<x)
		   {
			   prev_temp=temp;
			   temp=temp.right;
		   }
		   if(prev_temp.data<x)
		   {
			   Node new_temp=new Node(x,null,prev_temp.right);
			   prev_temp.right=new_temp;
		   }
	   	}
	   else if(temp.data>=x)
	   {
		   Node new_temp=new Node(x,null,root);
		   root=new_temp;
	   }
	   
   }
   public void cut()
   {
	   Node temp=root,prev_temp=temp;
	   int total_cut_value=0,count=0,flag=0;
	   int number_of_values=N;
	   System.out.println(N);
	   def:
	   for(int i=0;i<N;N=number_of_values-count)
	   {
		   int cut_value=0;
		   if(temp.data!=prev_temp.data)//Present Data & Previous data should not be same
		        cut_value=temp.data;
		   else if(total_cut_value==0 && temp.data==prev_temp.data )//For First time
			   cut_value=temp.data;
		   else if(temp.data==prev_temp.data)//If Present Data & Previous data are same
		   {
			   while(temp.data==prev_temp.data)//Moving the temporary position 
			   {
				   prev_temp=temp;
				if(temp.right!=null)
				   temp=temp.right;
			   }
			     cut_value=temp.data;
		   }
		   total_cut_value=cut_value;
		   Node new_temp=temp;
		   out:
		   while((new_temp.data-total_cut_value)<=0)
		   {
			   count++;
			   if(new_temp.right!=null)
			        new_temp=new_temp.right;
			   else
				   break out;
		   }
		   if(((number_of_values-count)<0))
			   break def;		  
		   else if(number_of_values-count>0)
			   {
			   System.out.println((number_of_values-count));		   
			   }
		   prev_temp=temp;
		   if(temp.right!=null)
		       temp=temp.right;
	   }
   }
	Cut_The_Sticks()
	{
      Scanner s=new Scanner(System.in);
      int count=0;
      N=s.nextInt();
      Integer x[]=new Integer[N];      
      out:
      if(N<=1000 && N>=1)
      {
    	  if(root==null)
    	  	{
    		  x[0]=s.nextInt();
    		root=new Node(x[0],null,null);  
    	  	}
      for(int i=1;i<N;i++)
      	{
    	  x[i]=s.nextInt();
    	  if(x[i]>1000)
    		  break out;
    	  else
    		  Merge_sort(x[i]);
      	}
      s.close();
      cut();
      }
      
	}
	public static void main(String[] args) 
	{
		Cut_The_Sticks obj=new Cut_The_Sticks();
		
	}
   public static class Node
   {
	   int data;
	   Node left,right;
	   Node(int data,Node left,Node right)
	   {
		   this.data=data;
		   this.left=left;
		   this.right=right;
	   }
   }
}
