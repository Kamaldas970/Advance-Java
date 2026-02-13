package BinarySearchTrees;
public class Insertion{
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public  Node insert(Node root, int value ){
        if(root==null){
          root= new Node(value);
          return root; 
        }


        if(root.data > value){
            root.left= insert(root.left, value);
        }

       else{
           root.right= insert(root.right, value);
        }

        return root;

    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static Node delete(Node root, int value){
        if(root.data > value){
            root.left=delete(root.left, value);
        }else if (root.data < value){
            root.right=delete(root.right, value);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.right==null){
                return root.left;

            }else{
                return root.right;
            }

            Node IS=InOrderSuccessor(root.right);
            root.data= IS.left;
           root.right= delete(root.right, value);
            
           
        }
        return root;
    }

    public static Node findIOS(Node root){
        while(root.left!=null){
            root=root.left;
           
        }
         return root;
    }



    public static void main(String args[]){
        int value[]={5,1,3,4,2,7};
        Insertion tree=new Insertion();
        Node root=null;

        for(int i=0;i<value.length;i++){
          root=tree.insert(root, value[i]);
        }
        inOrder(root);
        System.out.println(root);

    }
}