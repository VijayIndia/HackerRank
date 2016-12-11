import java.util.HashSet;
import java.util.Set;
import java.util.Collection.*;
import java.util.*;
class GemStones
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int n=Integer.parseInt(s.nextLine());
	int i=1;
	
	Set<Character> se=new HashSet<Character>();
	if(n>1)
		{
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		int si=0;
		while(si<ch.length)
			{	
			se.add(ch[si]);
			si++;
			}
		}
	while(i<n)
		{
		Set<Character> s1=new HashSet<Character>();
		String str2=s.nextLine();
		char ch2[]=str2.toCharArray();
		int sj=0;
		while(sj<ch2.length)
			{
			s1.add(ch2[sj]);
			sj++;
			}
		se.retainAll(s1);
		i++;
		}
	System.out.println(se.size());
	}
}