import java.util.ArrayList;
import java.util.*;
public class ArrayList_Example {

	public static void main(String[] args) 
	{
		int lastAns=0;
		Scanner s=new Scanner(System.in);
		String n_m=s.nextLine();
		String n_m_arr[]=n_m.split(" ");
		int n=Integer.parseInt(n_m_arr[0]);
		int m=Integer.parseInt(n_m_arr[1]);
		if(n>Math.pow(10,5) || n<1 || m>Math.pow(10,5) || m<1 )
			return;
		ArrayList<ArrayList> a=new ArrayList<ArrayList>(n);
		for(int i=0;i<n;i++)
		{
			ArrayList b=new ArrayList();
			a.add(b);
		}
		
		while(m>0)
		{
		String input=s.nextLine();
		String input_arr[]=input.split(" ");
		int option=Integer.parseInt(input_arr[0]);
		int x=Integer.parseInt(input_arr[1]);
		int y=Integer.parseInt(input_arr[2]);
		if(x>Math.pow(10,9)|| y>Math.pow(10,9) || x<0 || y<0)
			return;
				if(option==1)
					{			
						ArrayList c=a.get((x^lastAns)%n);
						c.add(y);			
					}
				else if(option==2)
					{
						ArrayList c=a.get((x^lastAns)%n);
						lastAns=(int)c.get(y%c.size());
						System.out.println(lastAns);
					}
		m--;
		}
	}

}
