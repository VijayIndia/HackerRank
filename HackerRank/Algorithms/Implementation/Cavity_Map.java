import java.util.Scanner;
public class Cavity_Map 
{

	public static void main(String[] args) 
	{
     Scanner s=new Scanner(System.in);
     int T=Integer.parseInt(s.nextLine());
    char arr[][]=new char[T][T];
    Integer arr_1[][]=new Integer[T][T];
     while(T>=1 && T<=100)
     {
    	 for(int i=0;i<T;i++)
    	 {
    		 String str=s.nextLine();
    		 arr[i]=str.toCharArray(); 
    		 for(int j=0;j<T;j++)
    		    arr_1[i][j]=Character.getNumericValue(arr[i][j]);
    	 }
    	 for(int i=0;i<T;i++)
    	 {
    		 for(int j=0;j<T;j++)
    		 {
    			
    			 if(i<T-1 && (j<T-1) && (i-1)>=0 && (j-1)>=0 && (arr_1[i][j]>arr_1[i][j+1])&&(arr_1[i][j]>arr_1[i+1][j]) && (arr_1[i][j]>arr_1[i-1][j]) && (arr_1[i][j]>arr_1[i][j-1]))
    			 {
    				 System.out.print("X");
    			 }
    			 else if(i<T &&j<T )
    				 System.out.print(arr_1[i][j]);
    		 }
    		 System.out.println();
    	 }
     }
	}

}
