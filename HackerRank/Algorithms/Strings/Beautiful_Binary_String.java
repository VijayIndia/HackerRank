import java.util.regex.*;
import java.util.*;
class Beautiful_Binary_String
{
public static void main(String args[])
	{
	int count=0;
	Scanner sc=new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    if(n>100 || n<1)
        return;
	String s=sc.nextLine();
	while(s.contains("010"))
	{
	s=s.replaceFirst("010","011");
	count++;
	}
	
System.out.println(count);
	}
}