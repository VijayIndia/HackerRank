public Queue q1=new LinkedList();  
boolean checkBST(Node root)
    {
        int i=1,j=1;
    Node temp=root;
        if(root!=null && root.data>=0 && root.data<=Math.pow(10,4))
           { 
            i=temp_check(temp); 
            inorder_value(root);
           j=check_inorder();
           }
        if(i==1 && j==1 )
            return true;
        else
            return false;
    }
    static int flag=0;
    public int temp_check(Node root)
        {
            Node temp=root;
            Queue<Node> q=new LinkedList<Node>();
            q.add(temp);
        while(!q.isEmpty())
            {
            Node temp_1=q.poll();            
            if(flag==1 && temp_1.left!=null)
                return 0;
            else if(flag==0  && temp_1.left==null)
                flag=1;
            else if(temp_1.left!=null && (temp_1.left.data>Math.pow(10,4) || temp_1.left.data<0))
                return 0;
            else if(flag==0 && temp_1.left!=null ) 
                {
                q.add(temp_1.left);
                }   
            if(flag==1  && temp_1.right!=null)
                return 0;
            else if(flag==0 && temp_1.right==null)
                flag=1;
            else if(temp_1.right!=null && (temp_1.right.data>Math.pow(10,4) || temp_1.right.data<0))
                return 0;
            else if(flag==0  && temp_1.right!=null) 
                {
                q.add(temp_1.right);
                }
           
            }
        	
            return 1;

         }
    public void inorder_value(Node root)
    {   
        if(root.left!=null)
            inorder_value(root.left);
              	   q1.add(root.data);
        if(root.right!=null)
   	        inorder_value(root.right);
    }
    public int check_inorder()
    {
        int curr_value=0,prev_value=0;
    while(!q1.isEmpty())
    		{
    		curr_value=(int)q1.poll();
    		if(prev_value<curr_value)
    			prev_value=curr_value;
    		else
    			return 0;
    		}
    	return 1;
    	
    }