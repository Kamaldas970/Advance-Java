package BinaryTrees;
public class BinaryTreePreOrder{
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

    static class bTree{

        static int idx=-1;

        public static Node buildtree(int nodes[]){
            idx++;
           if(idx >= nodes.length || nodes[idx] == -1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);

            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;
        }
        public static void preOrder(Node root){
            if(root==null){
                return;
            }
           
            System.out.println(root.data);
             preOrder(root.left);
             preOrder(root.right);

        }
        public static void InOrder(Node root){
            if(root==null){
                return;
            }
           
            InOrder(root.left);
            System.out.println(root.data);
            
             InOrder(root.right);

        }
        public static void PostOrder(Node root){
            if(root==null){
                return;
            }
             PostOrder(root.left);
            PostOrder(root.right);
           
            System.out.println(root.data); 

        }
         
    }

    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,3,-1,6,-1,-1};
        bTree b= new bTree();
        Node root=b.buildtree(nodes);
        //b.preOrder(root);
        //b.InOrder(root);
       
         b.PostOrder(root);
        System.out.println(root.data);

    }
}