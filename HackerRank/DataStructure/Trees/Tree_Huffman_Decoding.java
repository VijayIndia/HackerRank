/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
     Node temp=root;
     String decode=null;
    int j=0;
    while(j<S.length())
        {
          if(S.charAt(j)=='0')
          {
              temp=temp.left;
          }
          else if(S.charAt(j)=='1')
             {
                temp=temp.right;
             } 
          if(temp.data!='\0')
            {
              if(decode==null)
                  decode=String.valueOf(temp.data);
              else
                  decode+=String.valueOf(temp.data);
              temp=root;
          }
        j++;
    }
        System.out.println(decode);
        
    }
