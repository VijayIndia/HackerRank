/* Implement a Circular Linked List*/
import java.util.Scanner;
public class Truck_Tour 
{
	Node root;
	public void push(int a,int b)
	{
		if(root==null)
			root=new Node(a,b,null,null);
		else if(root!=null)
		{
			if(root.right==null)
				{
				Node new_temp=new Node(a,b,root,root);
				root.left=new_temp;
				root.right=new_temp;
				}
			else if(root.right!=null)
				{
				Node new_temp=new Node(a,b,root,root.right);
				root.right.left=new_temp;
				root.right=new_temp;
				}
		}
	}
	public void operation()
	{
		
		int count=0;
		out:
		while(root!=null)
			{
			Node temp=root;
			int left_count=0,right_count=0;
			  in:
				while(temp!=null &&temp.left!=root)//3.left!=root
					{
						if(left_count>=right_count)//10>=3
							{
								left_count+=temp.avail;//11
								right_count+=temp.dist;//8
								if(left_count>right_count)
								{
									left_count=left_count-right_count;
									right_count=0;
								}
								else 
								{
									right_count=right_count-left_count;
									left_count=0;
								}
							}
						else
							break in;
						temp=temp.left;//3
					}
		        if(temp.left==root)
		        {
		        	left_count+=temp.avail;//11
					right_count+=temp.dist;//8
					if(left_count>=right_count)
						{
						System.out.println(count);
			        	break out;
						}
		        }
		        else
		        {
		        	count++;
		        	root=root.left;
		        	//System.out.println("count="+count+",root="+root.avail);
		        }
		
			}
	}
	public void retrieve()
	{
		Node temp=root;
		while(temp.left!=root)
		{
			System.out.print(temp.avail+"\t");
			temp=temp.left;
		}
		if(temp.left==root)
			System.out.print(temp.avail);
	}
	public static void main(String[] args) 
	{
		Truck_Tour t=new Truck_Tour();
        Scanner s=new Scanner(System.in);
        int N=Integer.parseInt(s.nextLine());
        exit:
        while(N>0 && N<=100000 && N>=1)
        {
        	String str[]=s.nextLine().split(" ");
        	int x=Integer.parseInt(str[0]);
        	int y=Integer.parseInt(str[1]);
        	if(x>=1 && x<=1000000000 && y>=1 && y<=1000000000)
        		t.push(x,y);
            else 
                break exit;
        	N--;
        }
       //t.retrieve();
        t.operation();
	}
    public static class Node
    {
    	Node left,right;
    	int avail,dist;
    	Node(int avail,int dist,Node left,Node right)
    	{
    		this.avail=avail;
    		this.dist=dist;
    		this.left=left;
    		this.right=right;
    	}
    }
}
