import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Equal_brackets 
{
    static int total_value[]=new int[3];
    static Node root[];//root1,root2,root3;
    public void operation()
        {
        while((root[0]!=null) && (root[1]!=null) && (root[2]!=null) && ((root[0].total_sum!=root[1].total_sum) || (root[0].total_sum!=root[2].total_sum)))
            {
                if(root[0].total_sum > root[1].total_sum)
                    root[0]=root[0].next;
                else if(root[0].total_sum < root[1].total_sum)
                    root[1]=root[1].next;
               else if(root[0].total_sum > root[2].total_sum)
                            root[0]=root[0].next;
                else if(root[0].total_sum < root[2].total_sum)
                            root[2]=root[2].next;                      
                             
            }
        if(root[0]==null || root[1]==null || root[2]==null)
            System.out.print("0");
        else
             System.out.print(root[0].total_sum);

        }

    public static void main(String[] args) 
    {
    	Equal_brackets ss=new Equal_brackets();
        Scanner input = new Scanner(System.in);
        String n_input=input.nextLine();
        String n_input_arr[]=n_input.split(" "); 
        root=new Node[3];
        for(int i=0;i<3;i++)  
           {    
            int n=Integer.parseInt(n_input_arr[i]);
            if(n>(int)Math.pow(10,5) || n<1)
                return;
             String st=input.nextLine();
             String st_arr[]=st.split(" ");
             for(int j=n-1;j>=0;j--)
                    {
                    int value=Integer.parseInt(st_arr[j]);
                 if(value>100 || value<1)
                     return;
                    total_value[i]+=value;
                 if(root[i]==null)
                     root[i]=new Node(value,value,null);
                 else if(root[i]!=null)
                    {
                     Node temp=root[i];
                     temp=new Node(value,total_value[i],root[i]);
                     root[i]=temp;
                    }
                    }
            }
           ss.operation();
    } 
    public static class Node
        {
        Node next;
        int data,total_sum;
        Node(int data,int total_sum,Node next)
         {
            this.next=next;
            this.data=data;
            this.total_sum=total_sum;
          }
        }
       
}
