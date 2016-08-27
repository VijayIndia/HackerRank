

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */
static Node lca(Node root,int v1,int v2)
    {
    Node temp=root;
    if(root.left!=null && root.left.right!=null && root.left.left!=null && (root.left.data==v1 || root.left.data==v2) && ( (root.left.right.data==v1 || root.left.right.data==v2)||(root.left.left.data==v1 || root.left.left.data==v2)))
        return root;
    else if(v1<root.data && v2<root.data)
        {
        if(root.left!=null)
            temp=lca(root.left,v1,v2);
        }
    else if((root.left!=null && root.right!=null) && (v1==root.left.data && v2==root.right.data) ||(v1==root.right.data && v2==root.left.data))
        {       
            return root;
        }    
    else if(v1>root.data || v2>root.data)
        {
        return root;
        }
    return temp;
    }




