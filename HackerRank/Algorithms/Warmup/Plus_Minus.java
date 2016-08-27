import java.util.Scanner;
public class Plus_Minus 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int positiv=0,negativ=0,zero=0;
		int N=Integer.parseInt(s.nextLine());
		String input=s.nextLine();
		String arr[]=input.split(" ");
        for(int i=0;i<arr.length;i++)
        	{
        	   int x=Integer.parseInt(arr[i]);
        	   if(x>0)
        	   {
        		   positiv++;
        	   }
        	   else if(x<0)
        	   {
        		   negativ++;
        	   }
        	   else if(x==0)
        	   {
        		  zero++; 
        	   }
        	}
        System.out.println((double)positiv/N);
        System.out.println((double)negativ/N);
        System.out.println((double)zero/N);
	}

}
