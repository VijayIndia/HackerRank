import java.util.Scanner;
public class Intro_Tutorial_Challenges 
{

	
	public static void main(String[] args) 
	{
     Scanner s=new Scanner(System.in);
     int no_to_find=s.nextInt();
     int array_size=s.nextInt();
     Integer arr[]=new Integer[array_size];
     in:
     if(no_to_find>=1 && no_to_find<=1000)
     {
    	 for(int i=0;i<array_size;i++)
    	 	{
    		 arr[i]=s.nextInt();
    		 if(!(arr[i]>=-10000 && arr[i]<=10000))
    			 break in;
    	 	}
    	 int j=0;
     out:
    	 while(j<arr.length)
    	 {
    	 if(arr[j]==no_to_find)
    		 {
    		 System.out.println(j);
    		 break out;
    		 }
    	 j++;
    	 }
	}

  }
}
