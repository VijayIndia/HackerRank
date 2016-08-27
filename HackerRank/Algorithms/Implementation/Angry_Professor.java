import java.util.Scanner;


public class Angry_Professor 
{
	public static void main(String[] args) 
	{
		int N=0;//Total Number of Students
		int K=0;//Expected Number of Students
	    int T=0;//Number of Testcase
		String First_Line;//Contains Total Number of Students and Expected Number of Students
		String Second_Line;//Contains Arrival Time of Each Student
		Scanner s=new Scanner(System.in);
		T=Integer.parseInt(s.nextLine());
		while(T>=1 && T<=10 )
		{
			int Present_count=0;//Number of Students Actually present
			First_Line=s.nextLine();
			String First_Line_arr[]=First_Line.split(" ");
			N=Integer.parseInt(First_Line_arr[0]);
			K=Integer.parseInt(First_Line_arr[1]);
			if((N>=1 && N<=1000)&&(K>=1 && K<=N))
			{
				Second_Line=s.nextLine();
				String arrival_time[]=Second_Line.split(" ");
				for(int i=0;i<N;i++)
				{
					int x=Integer.parseInt(arrival_time[i]);
					if(x>=-100 && x<=100)
						Present_count+=(x<=0)?1:0;
				}
				System.out.println((Present_count>=K)?"NO":"YES");
					
			}
			
		T--;
		}
		s.close();
	}

}
