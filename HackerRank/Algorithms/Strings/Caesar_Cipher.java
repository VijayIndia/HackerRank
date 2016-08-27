import java.util.Scanner;
public class Caesar_Cipher 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int N=Integer.parseInt(s.nextLine());
		String str=s.nextLine();
		int K=s.nextInt();
		char ch[]=new char[str.length()];
		int j=0;
		if(K<=100 && K>=0 && N<=100 && N>=1 && str.length()<=100 && str.length()>=1)
		{
		while(j<str.length())
		  {
			ch[j]=str.charAt(j);
			//System.out.println("j="+j+"ch[j]="+ch[j]);
			j++;
		  }
		int i=0;
		while(i<str.length())
			{
			int x=((int)ch[i]);//198				
				//System.out.println("x="+x);
				if(x>=97 && x<=122)
				{
					x=((int)ch[i]+K);//198	
					while(x-26>=97 && x>122)
						{
						x=x-26;
						}
						//System.out.println("Final_Value="+x);
						ch[i]=(char)(x);
						//Systemout.println((char)x);
			   	}
				else if(x>=65 && x<=90)
				{
					x=((int)ch[i]+K);//198	
					while(x-26>=65 && x>90)
					{
					x=x-26;
					}
					//System.out.println("Final_Value="+x);
					ch[i]=(char)(x);
				    //System.out.println((char)x);
				}
				else
				{
					ch[i]=(char)(x);
				}
			 i++;
			}
		String conv_str =new String(ch);
		System.out.println(conv_str);
		}
	}
}
