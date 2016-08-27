import java.util.*;
public class Game_Of_Thrones_1 
{
	public void comparison(String str)
	{
		int i=0,twice=0,once=0,flag=0;
		out:
		while(i<str.length()-1)
		{
		if(str.charAt(i)==str.charAt(i+1))
			{
		//	System.out.println("("+str.charAt(i)+","+str.charAt(i+1)+")");
			i=i+2;
			twice++;
			//System.out.println("i="+i);
			}
		else if(str.charAt(i)!=str.charAt(i+1))
			{
			once++;
			i++;
			/*System.out.println("In second block,i="+i);
				if(count==2)
					{
					flag=1;
					System.out.println("NO");
					break out;
					}*/
			}
		else 
			i++;
		}
		//System.out.println("Its out of the loop");
		if(str.length()/2==twice || ((str.length()/2)-1)==twice)
		{
			if(str.length()%2==0 && twice==str.length()/2)
				System.out.println("YES");
			else if(str.length()%2==1 && (twice==str.length()/2 || once==1))
				System.out.println("YES");
			else if(once>=1)
				System.out.println("NO");
        
		}
            else
                System.out.println("NO");
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
      Scanner s=new Scanner(System.in);     
    	  String str=s.nextLine();
          Game_Of_Thrones_1 g=new Game_Of_Thrones_1();

    	  if(str.length()<=100000 && str.length()>=1)
    	  {
    		 str=g.sort(str);
    		// System.out.println("sorted="+str);
    		  g.comparison(str);
    	  }
    	  s.close();
	}

}
