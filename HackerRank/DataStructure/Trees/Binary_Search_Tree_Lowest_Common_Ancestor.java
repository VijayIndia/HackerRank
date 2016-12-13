

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */
static Node lca(Node root,int v1,int v2)
    {
    Node temp=null;
      if(root.data>v1 && root.data >v2 )//case 1
          {
          temp=lca(root.left,v1,v2);
          }
    else if(root.data<v1 && root.data <v2) //case 2
       {
          temp=lca(root.right,v1,v2);
       }
    else if(root.data>=v1 && root.data<=v2 || root.data<=v1 && root.data>=v2)//case 3
       {
       return root; 
       }
    return temp;
       
    }
