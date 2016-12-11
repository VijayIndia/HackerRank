   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
      Queue<Node> q=new LinkedList<Node>();   
           q.add(root);
     while(!(q.isEmpty()))
         {
            Node temp=q.peek();
            if(temp.left!=null)
                q.add(temp.left);  
            if(temp.right!=null)
                q.add(temp.right);
            System.out.print(q.poll().data+" ");
         }
     }


