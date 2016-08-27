import java.util.Scanner;
public class Love_Letter_Mystery 
{
   public void comparison(String First,String Last)
   {
	   int i=0,count=0;
	   while(i<First.length())
	   { 
		   int l=First.charAt(i);
		   int m=Last.charAt(i);
				if(l<m &&m>=97)
				{
				  	count+=m-l;
				}				
				else if(l>m && l>=97)
				{
				  	count+=l-m;
				}
		  
		   i++;
	   }
	   System.out.println(count);
   }
   public String reverse(String Last)
   {
	  int Last_length=Last.length();
	  int Str_length=Last.length()-1;
	  int i=0;
	 char rev_string[]=new char[Last_length];
	  while(i<Last_length)
	  {
		  rev_string[i]=Last.charAt(Str_length);
		  i++;		  
		  Str_length--;
	  }
	  String Last_str= new String(rev_string);
	   return Last_str;
   }

	public static void main(String[] args)
	{
		Love_Letter_Mystery L=new Love_Letter_Mystery();
		Scanner s=new Scanner(System.in);
		try
		{
		int T=Integer.parseInt(s.nextLine());
		while(T>0)
		{
		String str=s.nextLine();
		int str_length=str.length();
		String First=null,Last=null;
		if(str_length>=1 && str_length<=10000)
		{
		if(str_length%2==0)
		{
			First=str.substring(0,(str_length)/2);
			Last=str.substring((str_length)/2,str.length());
			
		}
		else if(str_length%2==1)
		{
			First=str.substring(0,(str_length-1)/2);
			Last=str.substring(((str_length)/2)+1,str.length());
		}
		Last=L.reverse(Last);
		if(!(First.equals(Last)))
		{
		 L.comparison(First,Last);	
		}
		else
			System.out.println(0);
		}
		}
		T--;
		s.close();
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
