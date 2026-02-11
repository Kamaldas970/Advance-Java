package BinaryTrees;
public class DiaOfTree{

   
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int lft=height(root.left);
        int rgt=height(root.right);
        return Math.max(lft, rgt)+1;
    }
    public static int dia(Node root){
        if(root==null){
            return 0;
        }
     
        int lt=dia(root.left);
        int lfth=height(root.left);

        int rt=dia(root.right);
        int rth=height(root.right);
       int selfdia=rth+lfth+1;

        return Math.max( Math.max(lt, rt), selfdia);

    }
    public static void main(String args[]){
        
        Node root=new Node(1);
       root.left=new Node(2);
        root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.left=new Node(6);
         root.right.right=new Node(7);
        
          System.out.println(dia(root));



    

    }
}