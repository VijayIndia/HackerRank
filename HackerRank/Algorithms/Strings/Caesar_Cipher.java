import java.util.*;
public class Solution 
{
    public void input()
        {
            Scanner in = new Scanner(System.in);
            int n = Integer.parseInt(in.nextLine());
            int sarr[]=new int[n];
            String s = in.nextLine();
            int k = Integer.parseInt(in.nextLine());
            if(n>100 || n<1 || k>100 || k<0 || s.contains(" "))
                   return;            
            k=k%26;
            char ch[]=s.toCharArray();
            for(int i=0;i<n;i++)
                {
                    sarr[i]=((int)ch[i]);
                    if((sarr[i]>=65 && sarr[i]<=90))
                        {
                        sarr[i]-=65;
                        sarr[i]+=k;
                        sarr[i]%=26;
                        ch[i]=(char)(65+sarr[i]);
                        }
                    if((sarr[i]>=97 && sarr[i]<=122))
                        {
                        sarr[i]-=97;
                        sarr[i]+=k;
                        sarr[i]%=26;
                        ch[i]=(char)(97+sarr[i]);
                        }
                    System.out.print(ch[i]);
                }
        }

    public static void main(String[] args) 
    {
        Solution s=new Solution();
        s.input();
    }
}
