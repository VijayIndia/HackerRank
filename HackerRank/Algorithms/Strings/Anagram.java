import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
   public void comparison(String First,String Last)
   {
	   int i=0,count=0,j=0;
	   while(i<First.length() &&j<First.length() )
	   { 
		   int l=First.charAt(i);
		   int m=Last.charAt(j);
				if(l<m && m>=97 && m<=122)
				{
					count++;
					i++;
				}				
				else if(l>m && l>=97 && l<=122)
				{
					j++;					
				}
				else if(l==m)
				{
					i++;
					j++;
				}
						  
		   
	   }
	   System.out.println(count+((j-i)>0?(j-i):0));
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
	  //System.out.println("Last_Str="+Last_str);
	   return Last_str;
   }
   public String sort(String Last)
   {
	  char sort_string[]=Last.toCharArray();
	  Arrays.sort(sort_string);
	 String s=new String(sort_string);
	 return s;
   }


	public static void main(String[] args)
	{
		Anagram L=new Anagram();
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
							First=L.sort(First);
							Last=L.sort(Last);
			
							if(!(First.equals(Last)))
								{
								L.comparison(First,Last);	
								}
							else
								System.out.println("0");
						}
					else 
						System.out.println("-1");
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
