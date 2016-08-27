import java.util.Scanner;
class Grid_Search
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int T=Integer.parseInt(s.nextLine());
	while(T>0)
	{
		/* Getting  input for G */
		String G_r_c[]=s.nextLine().split(" ");
		int G_r=Integer.parseInt(G_r_c[0]);
		int G_c=Integer.parseInt(G_r_c[1]);	
		String G_str[]=new String[G_r];
		char G_ch[][]=new char[G_str.length][];
		int i=0;
		while(i<G_str.length)
		{
		G_str[i]=s.nextLine();
		G_ch[i]=G_str[i].toCharArray();
		i++;
		}
		/* Getting Input for G Ends*/
		/* Getting Input for P */
		String P_r_c[]=s.nextLine().split(" ");
		int P_r=Integer.parseInt(P_r_c[0]);
		int P_c=Integer.parseInt(P_r_c[1]);
		String P_str[]=new String[P_r];
		char P_ch[][]=new char[P_str.length][];
		i=0;
		while(i<P_str.length)
		{
		P_str[i]=s.nextLine();
		P_ch[i]=P_str[i].toCharArray();
		/* Getting Input for P Ends */
        i++;
		}
		int k=0,l=0,x=0,y=0,m=0,n=0,o=0,p=0,flag=0,count=0;
out:
	while(l<G_r && (l+P_r<=G_r))//l=1 P_r=3 ,<5
			{
		    k=0;
			while(k<G_c && (k+P_c<=G_c))//k=1,P_c=6 <10
				{
					if(P_ch[x][y]!=G_ch[l][k])//12
						{
						k++;
						}
					else if(P_ch[x][y]==G_ch[l][k])
						{
						m=x;
						n=y;
						o=l;
						p=k;
						flag=1;
						}
					if(flag==1)
						{
						flag=0;
						while(o<G_r && m<P_r)
							{
							n=y;
							p=k;
							while(n<P_c && p<G_c && P_ch[m][n]==G_ch[o][p])
								{
								n++;
								p++;
								count++;
								}
							
							o++;
							m++;
							} 
						if(count==P_r*P_c)
						{		
						System.out.println("YES");
						flag=2;
						break out;
						}	
						else if(k+1!=G_c)
							{
							count=0;
							k++;
							}
						else if(l+1!=G_r)
							{
							count=0;
							l++;
							}
						}
					
					
				} 
			l++;
			}
		if(flag!=2)
			System.out.println("NO");
		T--;
	}
	}
}