import java.util.Arrays;
import java.util.Scanner;


public class Make_it_Anagram 
{

	 public void comparison(String First,String Last)
	   {
		   int i=0,count=0,j=0;
		  // System.out.println("First="+First+"Last="+Last);
		   while(i<First.length() &&j<Last.length() )
		   { 
			   int l=First.charAt(i);
			   int m=Last.charAt(j);
					if(l<m && m>=97 && m<=122)
					{
						//System.out.println("l="+l);
						count++;
						i++;
					}				
					else if(l>m && l>=97 && l<=122)
					{
						count++;
						j++;					
					}
					else if(l==m)
					{
						i++;
						j++;
					}
							  
			   
		   }
		   System.out.println(count+(First.length()-i)+(Last.length()-j));
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
		Make_it_Anagram L=new Make_it_Anagram();
		Scanner s=new Scanner(System.in);
		try
		{
			
					String str_1=s.nextLine();
					String str_2=s.nextLine();
						
			                 str_1=L.sort(str_1);
			                 str_2=L.sort(str_2);
			                 L.comparison(str_1,str_2);
						
				
		}
		catch(Exception e)
		{
		
		}
	}

}
