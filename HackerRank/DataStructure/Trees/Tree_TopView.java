
void top_view(Node root)
{
    if(root.left!=null)
        left_view(root.left);
    if(root!=null)
        System.out.print(root.data+" ");
    if(root.right!=null)
       right_view(root.right);
}
void left_view(Node root)
   {
    if(root.left!=null)
        left_view(root.left);
    if(root!=null)
        System.out.print(root.data+" ");
   }
void right_view(Node root)
    {
     if(root!=null)
        System.out.print(root.data+" ");
      if(root.right!=null)
         right_view(root.right);   
    }