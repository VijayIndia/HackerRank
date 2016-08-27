/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
    
    if(S!=null)
        {
        Node temp=root;
        for(int i=0;i<S.length();)
         {       
         if(S.charAt(i)=='0')
            {
            temp=temp.left;
            }
        else if(S.charAt(i)=='1')
            {
            temp=temp.right;
            }
        if(temp.left!=null || temp.right!=null)
            {
            i++;
            }
        else if(temp.left==null && temp.right==null)
           {
           System.out.print(temp.data);
            S=S.substring(i+1,S.length());
            decode(S,root);
            break;
           }
        }
        }
        
       
    }
