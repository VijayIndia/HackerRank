static Node root1;
static int root_flag=0;
   static Node insert(Node root,int val)
    {
       if(root_flag==0)
          {
           root1=root;
           root_flag=1;
          }
       int flag=0;
       Node temp=root1,new_temp=null;
       new_temp=new Node();
       new_temp.val=val;
       new_temp.ht=0;
       new_temp.left=null;
       new_temp.right=null;
       if(temp!=null)
           {
           while(flag!=1)
               {
           if(temp.val>val && temp.left!=null)
               temp=temp.left;
               
           else if(temp.val<val && temp.right!=null)
                temp=temp.right;
           else 
              {
               flag=1;               
               if(temp.val>val && temp.left==null)
                       temp.left=new_temp;
               else if(temp.val<val && temp.right==null)
                       temp.right=new_temp;
                   height(root1,root1);
             }
      
         }
       }
       return root1;
   }

    public static int height(Node parent,Node temp)
        {
        int temp_left=-1,temp_right=-1;
        if(temp!=null && temp.left!=null)
            temp_left=height(temp,temp.left);
               
        if(temp!=null && temp.right!=null)
            temp_right=height(temp,temp.right);
        
        
        if(temp_left==-100 || temp_right==-100)
            return -100;
        if(temp!=null && temp_left-temp_right>=-1 && temp_left-temp_right<=1)
           {
            temp.ht=Math.max(temp_left,temp_right)+1;
            return Math.max(temp_left,temp_right)+1;
           }
else if((temp_left-temp_right>=2) || (temp_right-temp_left>=2))
{
           changes(parent,temp,temp_left,temp_right);
           return -100;
            }
        else 
            return 0;
        }

    public static void changes(Node parent,Node temp,int temp_left,int temp_right)
        {
        int left_flag=0,right_flag=0;
      if(temp_left>temp_right)
            {
             Node Left_child=temp.left;
            if(Left_child.right!=null && ((Left_child.left==null && Left_child.right.ht>=0) ||  (Left_child.left!=null && Left_child.left.ht<Left_child.right.ht)))
              {
                Node temp_next=Left_child.right;
               while(temp_next.left!=null)
                   temp_next=temp_next.left;
                temp_next.left=Left_child;
                temp.left=Left_child.right;
                Left_child.right=null;  
                left_flag=1;
              }
               Left_child=temp.left;
            
            if(left_flag==1 ||(Left_child!=null && Left_child.left.ht>=0 && Left_child.right==null)||(Left_child!=null && Left_child.left!=null && Left_child.right!=null  && Left_child.left.ht>Left_child.right.ht) )
                {
                Node Left_right=temp.left;
                while(Left_right.right!=null)
                    Left_right=Left_right.right;
                if(parent.left==temp)
                    parent.left=Left_child;
                else if(parent.right==temp)
                    parent.right=Left_child;
                else if(parent==temp && parent==root1)
                    root1=Left_child;  

                Left_right.right=temp;
                temp.left=null;
                left_flag=0;
                }
            }
        else if(temp_left<temp_right)
            {                     
                 Node right_child=temp.right;
            if(right_child.left!=null && ((right_child.right!=null && right_child.right.ht < right_child.left.ht)|| (right_child.left.ht>=0 && right_child.right==null )))
                {
                Node temp_next=right_child.left;
                while(temp_next.right!=null)
                    temp_next=temp_next.right;
                temp_next.right=right_child;
                temp.right=right_child.left;
                right_child.left=null;
                right_flag=1;
                }
               right_child=temp.right;
            if(right_flag==1 || (right_child!=null && right_child.right!=null && right_child.right.ht>=0 && right_child.left==null) || (right_child.right!=null && right_child.left!=null && right_child.right.ht>right_child.left.ht))
                {
                 Node right_left=temp.right;
                while(right_left.left!=null)
                    right_left=right_left.left;
                if(parent.right==temp)
                    parent.right=right_child;
                else if(parent.left==temp)
                    parent.left=right_child;
                else if(parent==temp && parent==root1)
                    root1=right_child;                    
                right_left.left=temp;
                temp.right=null;
                right_flag=0;
                }
            }
      
        height(root1,root1);        
        }