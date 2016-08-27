import java.util.Scanner;



public class Simple_Text_Editor 
{
    
   static Scanner s=new Scanner(System.in);
   static int T=Integer.parseInt(s.nextLine());
   String undo_str[]=new String[T];
   String str;
    int count=0;
	public String append(String x)
	{
		undo_str[count]=str;
        count++;
		if(str==null)
			str=x;
		else
			str=str+x;
		return str;
	}
	public String erase(int k)
	{
		undo_str[count]=str;
        count++;
		if(str!=null)
			str=str.substring(0,str.length()-k);
		else if(str==null)
			 return "";
		return str;
	}
	public String get(int k)
	{
		if(str.length()>=k)
			return String.valueOf(str.charAt(k-1));
		else 
			return "";
	}
	public void undo()
	{
		if(count-1>=0 && undo_str[count-1]==null)
        { 
            str=null;  
            count--;
        }
		else if(count-1>=0 && undo_str[count-1]!=null)
			{
			str=undo_str[count-1];
            count--;
			}
	}
	
	public static void main(String[] args) 
	{
      Simple_Text_Editor se=new Simple_Text_Editor();
      String x=null;
      while(T>0)
      {
    	  String st_line=s.nextLine();
    	  String str[]=st_line.split(" ");
    	  if(Integer.parseInt(str[0])==1)
    		    x=se.append(str[1]);
    	  else if(Integer.parseInt(str[0])==2)
    		    {
    		  	x=se.erase(Integer.parseInt(str[1]));
    		    }
    	  else if(Integer.parseInt(str[0])==3)
    	  		{
    		  	x=se.get(Integer.parseInt(str[1]));
    		  	System.out.println(x);
    	  		}
    	  else if(Integer.parseInt(str[0])==4)
    		    {
    		  		se.undo();
    		    }
    	  T--;
      }
	}

}
