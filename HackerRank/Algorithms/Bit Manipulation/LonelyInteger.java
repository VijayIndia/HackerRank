import java.util.*;
class LonelyInteger
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	short n=Short.parseShort(s.nextLine());
	String str=s.nextLine();
	String arr[]=str.split(" ");
	int int_arr[]=new int[n];
	int result=0;
	for(int i=0;i<n;i++)
		{
		int_arr[i]=Integer.parseInt(arr[i]);
		if(result==0)
			result=int_arr[i];
		else
			result=int_arr[i]^result;
		}
	System.out.println(result);
	}
}