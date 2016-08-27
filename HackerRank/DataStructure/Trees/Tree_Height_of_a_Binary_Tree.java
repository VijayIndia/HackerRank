   /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
    {
       int height_left=0,height_right=0;
       if(root.left!=null)
            height_left=1+height(root.left);
       if(root.right!=null)
            height_right=1+height(root.right); 
       else if(root.left==null && root.right==null)
           return 0;
       if(height_left>=height_right)
            return height_left;
       else if(height_left<height_right)
           return height_right;
       else
           return 0;
    }
