package BinarySearchTrees;
public class Mirror{
   static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    public static Node mirrorBST(Node root){
        if(root==null){
            return null;
        }

       Node leftmirror= mirrorBST(root.left);
        Node rightmirror=mirrorBST(root.right);

      root.right =  leftmirror;
       root.left  = rightmirror;

        return root;

    }
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
         System.out.println(root.data);
        preorder(root.left);
       
        preorder(root.right);
    }

    public static void main(String args[]){
        Mirror t=new Mirror();
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.right=new Node(6);
        root.left.left=new Node(3);
       
        root.right.right=new Node(11);

       
 preorder(root);
        root=mirrorBST(root);
        System.out.println(root);
        preorder(root);
       

    }
}