import java.util.Scanner;
public class A_Very_big_sum 
{

	public static void main(String[] args) 
	{
	 Scanner s=new Scanner(System.in);
     int N=Integer.parseInt(s.nextLine());
     String str=s.nextLine();
     String str_array[]=new String[N];
     int front_value=0,back_value=0;
     Integer back_array[]=new Integer[N];
     str_array=str.split(" ");
     String back=null;
     int i=0,count=0;
     while(i<N)
     {
    	 int value=Integer.parseInt(str_array[i]);
    	 if(String.valueOf(value).length()>=5)
    		 count++;
    	 front_value+=value/100000;
    	 back_value+=value%100000;   	
    	i++;
     }
     if(count>0)
     {
    	 int str_back_value=String.valueOf(back_value).length();

    	 if(str_back_value>5)
    		 {
    		 front_value+=back_value/100000;
    		 back=String.valueOf(back_value);
    		 back=back.substring(String.valueOf(back_value).length()-5,String.valueOf(back_value).length());
    		 }
    	 else if(str_back_value<5)
    	 {
    		 back=String.valueOf(back_value);
    		 while(str_back_value<5)
        	 {
        		 back="0"+back;
        		 str_back_value++;
        	 }
    		 

    	 }
    	 System.out.print(front_value+""+back); 
    }
     else
    	 System.out.print(back_value);
   // String.valueOf(back_value).substring(5, );
     
	}

}
    