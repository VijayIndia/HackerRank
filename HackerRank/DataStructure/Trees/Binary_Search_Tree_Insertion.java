 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

    static Node Insert(Node root,int value)
    {
       Node new_temp=new Node();
      if(root==null)
          {
              new_temp.data=value;
              new_temp.left=null;
              new_temp.right=null;
              root=new_temp;
          }
      else if(root.data>=value)
           {
           if(root.left!=null)
                Insert(root.left,value);
           else
                {
                    new_temp.data=value;
                    new_temp.left=null;
                    new_temp.right=null;
                    root.left=new_temp;
                }
           }
      else if(root.data<value)
          {
          if(root.right!=null)
                Insert(root.right,value);
          else
             {
                    new_temp.data=value;
                    new_temp.left=null;
                    new_temp.right=null;
                    root.right=new_temp;
             }
          }
    return root;
    }


   

