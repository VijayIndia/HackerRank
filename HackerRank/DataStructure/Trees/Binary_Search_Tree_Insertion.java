 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */
static Node Insert(Node root,int value)
    {
    if(root==null)
        {
        Node new_node=new Node();
        new_node.data=value;
        new_node.left=null;
        new_node.right=null;        
        root=new_node;
        }
    else if(root.data>value && root.left!=null )
        Insert(root.left,value);
    else if(root.data<value && root.right!=null )
        Insert(root.right,value);
    else if(root.data>value && root.left==null )
    {
        Node new_node=new Node();
        new_node.data=value;
        new_node.left=null;
        new_node.right=null;
        root.left=new_node;
    }
    else if( root.data<value && root.right==null )
        { 
        Node new_node=new Node();
        new_node.data=value;
        new_node.left=null;
        new_node.right=null;
        root.right=new_node;
        }
    return root;
    }
