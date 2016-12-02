import java.util.*;

public class AngryProfessor 
{
    public static void input()
        {
        Scanner s=new Scanner(System.in);
        int studentpresent=0,n=0,k=0,i=0;
        int testcase=Integer.parseInt(s.nextLine());
        while(testcase>0)
          {
        String n_k[]=s.nextLine().split(" ");
        String input[]=s.nextLine().split(" ");
        n=Integer.parseInt(n_k[0]);
        k=Integer.parseInt(n_k[1]);
        studentpresent=0;
        for(i=0;i<n;i++)
            {
                if((Integer.parseInt(input[i]))<=0)
                    studentpresent++;
            }
        if(studentpresent>=k)
             System.out.println("NO");
        else             
            System.out.println("YES");       
        testcase--;  
          }
        }
    
    
    public static void main(String[] args) 
    {        
        input();
    }
}
