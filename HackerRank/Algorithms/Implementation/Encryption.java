import java.math.*;
import java.util.Scanner;
public class Encryption_1 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine().replaceAll("\\s+","").trim();
		int str_length_floor=(int)Math.floor(Math.sqrt(str.length()));
		int str_length_ceil=(int)Math.ceil(Math.sqrt(str.length()));
		if(str.length()>0 && str.length()<=81)
		{
			if(str_length_ceil*str_length_floor<str.length())
				{
					str_length_floor=str_length_floor+1;	
				}
			char ch[][]=new char[str_length_floor][str_length_ceil];
			for(int i=0;i<str_length_floor;i++)
				{
					for(int j=0;j<str_length_ceil;j++)
						{
							if(((i*str_length_ceil)+j)<str.length())
								ch[i][j]=str.charAt((i*str_length_ceil)+j);
							else
								ch[i][j]=' ';
						}
				}
			for(int j=0;j<str_length_ceil;j++)
				{
					for(int i=0;i<str_length_floor;i++)
						{
                        if(ch[i][j]!=' ')
							System.out.print(ch[i][j]);
						}
					System.out.print(" ");
				}
		}

	}

}
