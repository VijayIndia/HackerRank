import java.util.Scanner;
import java.util.Arrays;

public class Two_Strings 
{

	public void sort(String a,String b)
	{
		int i=0,flag=0,j=0;
		char arr1[]=a.toCharArray();
		char arr2[]=b.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String arr1_string=new String(arr1);
		String arr2_string=new String(arr2);
		int length=((arr1_string.length()<arr2_string.length())?arr1_string.length():arr2_string.length());
		out:
		while(i<length)
		{
			while(j<length && (arr1_string.charAt(i)>=arr2_string.charAt(j)) )
			{					
				if(arr1_string.charAt(i)==arr2_string.charAt(j))
				{
					flag=1;
					System.out.println("YES");
					break out;
				}
				j++;
			}
			i++;			
		}
		if(flag==0)
		{
			System.out.println("NO");
		}
	}
	public static void main(String[] args) 
	{
		Two_Strings ts=new Two_Strings();
		Scanner s=new Scanner(System.in);
		try
		{
		int T=Integer.parseInt(s.nextLine());
	     while(T>=1 && T<=10)
	     {
	    	 String str1=s.nextLine();
	    	 String str2=s.nextLine();
	    	 if(str1.length() >=1 &&str2.length()>=1 &&  str1.length()<=100000 && str2.length()<=100000)
	    	 ts.sort(str1,str2);
	    	 
	     }
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			s.close();
		}
	}

}
