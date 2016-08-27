import java.util.Scanner;


public class Lisa_Workbook 
{
	static int n,k,page_no=1,count=0;
	public void abc(int x)
	{
		int i=1;
		while(i<=x)
		{
			int y=0;
			while(y<k && (i+y)<=x)
				{
					if((i+y)==page_no)
						{
						count++;
						}
					y++;
				}
			i+=y;
		page_no++;
		}
	}
	
	public static void main(String[] args) 
	{
		Lisa_Workbook  L=new Lisa_Workbook ();
		Scanner s=new Scanner(System.in);
		String first_line[]=(s.nextLine().split(" "));
		n=Integer.parseInt(first_line[0]);
		k=Integer.parseInt(first_line[1]);
		String second_line[]=s.nextLine().split(" ");
		int i=0,no_of_problem_int=0;
		while(i<n)
		{
			no_of_problem_int=Integer.parseInt(second_line[i]);
			L.abc(no_of_problem_int);
			i++;
		}
		System.out.println(count);
	}

}
