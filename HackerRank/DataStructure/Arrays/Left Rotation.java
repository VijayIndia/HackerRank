import java.util.*;
public class Left_Rotation 
{


	public static void main(String[] args) 
	{
      List a=new ArrayList();
      Scanner s=new Scanner(System.in);
      String First_Line=s.nextLine();
      String Second_Line=s.nextLine();
      String First_Arr[]=First_Line.split(" ");
      int n=Integer.parseInt(First_Arr[0]);
      int d=Integer.parseInt(First_Arr[1]);
      if(n>Math.pow(10,5) || n<1 || d>n || d<1 )
    	  return;
      
      String Second_Arr[]=Second_Line.split(" ");
      for(int i=0;i<Second_Arr.length;i++)
      {
    	  int val=Integer.parseInt(Second_Arr[i]);
    	  if(val<1 || val>Math.pow(10,6))
    		  return;
    		  
    		  a.add(val);
      }
      int j=0;	
      while(j<d)
    	  {
    	  a.add((Second_Arr.length)+0,a.get(0));
    	  a.remove(0);
    	  j++;
    	  }
      for(int i=0;i<Second_Arr.length;i++)
    	  System.out.print(a.get(i)+"\t");
      s.close();
	}

}
