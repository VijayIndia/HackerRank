   /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
    {
       if(root!=null)
           {
                if(root.left!=null && root.right!=null)
                   return (Math.max(height(root.left),height(root.right))+1);
                else if(root.right!=null)
                    return height(root.right)+1;
                else if(root.left!=null)
                    return height(root.left)+1;
            }
       return 0;
    }
