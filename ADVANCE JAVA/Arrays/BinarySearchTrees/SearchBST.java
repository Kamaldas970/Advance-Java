package BinarySearchTrees;
public class searchBST{
   static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data=data;
        }
    }

    public static Node insert(Node root, int value){

        if(root==null){
             root=new Node(value);
            return root;
        }

     if(root.data > value){
        root.left=insert(root.left, value);

     }else{
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

    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }

         if(root.data==key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
             
           
        }
        else{
              return search(root.right, key);
        }


        
       
       
    }


    public static Node delete(Node root, int value){

        if(root==null){
            return null;
        }
        if(root.data > value){
            root.left=delete(root.left, value);
        }else if (root.data < value){
            root.right=delete(root.right, value);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
             if(root.right==null){
                return root.left;

            }else if(root.left==null){
                return root.right;
            }

            Node IS=InOrderSuccessor(root.right);
            root.data= IS.data;
           root.right= delete(root.right, IS.data);
            
           
        }
        return root;
    }

    public static Node InOrderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
           
        }
         return root;
    }

    public static void main(String arg[]){
         int value[]={1,3,4,5,6,8,10,11,14};
        searchBST tree=new searchBST();
        Node root=null;

        for(int i=0;i<value.length;i++){
            root=insert(root, value[i]);
        }

        inOrder(root);
        System.out.print(root);

    //     int key=1;

    //    if(search(root, 1)){
    //     System.out.println("the key was found");

    //    }else{
    //     System.out.println("The key was not found");
    //    }

      root= delete(root, 1);
      System.out.print(root);
       inOrder(root);
        System.out.print(root);


    


    }
}