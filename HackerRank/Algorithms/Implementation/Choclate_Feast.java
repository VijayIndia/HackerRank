import java.util.Scanner;
public class Choclate_Feast
{

	public static void main(String[] args) 
	{
         Scanner s=new Scanner(System.in);
        try
            {
   
    int T=s.nextInt();
    int x=1;
    while(T>=1 && T<=1000)
    	{
    int N=s.nextInt();
    int C=s.nextInt();
    int M=s.nextInt();
    int Choclates_bought=N/C;
    int copy_Chocolates_bought=Choclates_bought;//3
    int Choclates_exchanged=0,Choclates_not_exchanged=0;
    if(N<=100000 && N>=2 && C>=1 && C<=N && M>=2 && M<=N  )
    {	
    while(copy_Chocolates_bought>=1)//3>=1
    {
    Choclates_exchanged=(copy_Chocolates_bought/M);//1
    Choclates_not_exchanged+=copy_Chocolates_bought%M;//2
    copy_Chocolates_bought=Choclates_exchanged;//1
    Choclates_bought+=Choclates_exchanged;//3
    }

    while(Choclates_not_exchanged>1)//2>0
    {
    Choclates_bought+=Choclates_not_exchanged/M;//1
    Choclates_not_exchanged=(Choclates_not_exchanged%M+Choclates_not_exchanged/M)/M;//
    Choclates_bought+=Choclates_not_exchanged;
    }
    System.out.println(Choclates_bought);
    	
    }
    	}
        }
        catch(Exception e)
        {
            
        }
        finally
        {
            s.close();
        }

	}
}