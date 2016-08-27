import java.util.Scanner;


public class Funny_String
{

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
		Scanner s=new Scanner(System.in);
		Funny_String fs=new Funny_String();
		try
            {
        int T=Integer.parseInt(s.nextLine());
     while(T>=1 && T<=10)
     {
    	 String str=s.nextLine();
    	 String rev_str=fs.reverse(str);
    	 int i=0,j=1,flag=0;
    	 Exit:
    	 while(i<str.length()-1 && str.length()>=2 && str.length()<=10000)
    	 {
    		 if(j<str.length())
    		 {
    			 int x=str.charAt(j)-str.charAt(i);//(0,1),(1,2),(2,3)
    			 int y=rev_str.charAt(j)-rev_str.charAt(i);
    					 if(Math.abs(x)!=Math.abs(y))
    					 {
    						 System.out.println("Not Funny");
    						 flag=1;
    						 break Exit;
    					 }
    				 j++;
    		 }
    		 i++;
    	 }
    	 if(flag==0)
    		 System.out.println("Funny");
    	T--; 
     }
        }
        catch(Exception e)
            {
            
        }
        finally
            {s.close();}
	}

}
