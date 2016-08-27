import java.util.Scanner;


public class Alternating_Characters 
{
	static int flag=3;
	static int count=0;
	
	public void str(char ch)
	{
	 if(ch=='A' && (flag==1 || flag==3))
	 {
		 flag=0;
	 }
	 else if(ch=='B' && (flag==0 || flag==3))
	 {
		 flag=1;
	 }
	 else if((ch=='A' && (flag==0)) || (ch=='B' && flag==1) )
	 {
		 count++;
	 }
		
		
	}
	
	public static void main(String[] args) 
	{
	Alternating_Characters ac=new Alternating_Characters();
    Scanner s=new Scanner(System.in);
    int T=Integer.parseInt(s.nextLine());
    while(T>0)
    {
    String x=s.nextLine();
    int x_length=x.length()-1;
    	while((x_length)>=0)
    		{
    			ac.str(x.charAt(x_length));
    			x_length--;
    		}
        System.out.println(count);
        flag=3;
        count=0;
    	T--;
    }
	}

}
