package BinarySearchTrees;
import java.util.*;
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

    public static void range(Node root,int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data<=k1 && root.data>=k2){
            range(root.left, k1, k2);
            System.out.println(root.data);
            range(root.right, k1, k2);

        }
           else if(root.data < k1){
               range(root.left, k1, k2);
            }
            else{
              range(root.left, k1, k2);
            }
        


    }

  public static void printleaf(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
           System.out.print(path.get(i) + "->");
        }
        System.out.println("NULL");
    }
    public static void rootleaf(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }

      path.add(root.data);

      if(root.left==null && root.right==null){
        printleaf(path);
      }else{

      rootleaf(root.left, path);
      rootleaf(root.right, path);
      path.remove(path.size()-1);
      }

    }
    public static boolean isValid(Node root, Node min, Node max){
        if(root==null){
            return true;
        }

        if(min!=null && root.data <= min.data){
            return false;
        }
        else if(max!=null && root.data >= max.data){
            return false;
        }

        return isValid( root.left,root, min) 
                && isValid(root.right, root, max);
    }

   public static Node createBST(int value[], int st, int end){
  if(st>end){
return null;
  }


    int mid=(st+end)/2;
    Node root=new Node(value[mid]);
    root.left=createBST(value, st, mid-1);
    root.right=createBST(value, mid+1, end);
    return root;
}
  

    public static void main(String arg[]){
          int value[]={1,1,1,1};
       
        searchBST tree=new searchBST();
        Node root=null;

        for(int i=0;i<value.length;i++){
            root=insert(root, value[i]);
        }

      inOrder(root);
    System.out.println(root);

        int key=1;

       if(search(root, 1)){
        System.out.println("the key was found");

       }else{
        System.out.println("The key was not found");
       }

      root= delete(root, 1);
      System.out.print(root);
       inOrder(root);
        System.out.print(root);
        range(root, 5, 12);

       
        rootleaf(root, new ArrayList<>());
       if(isValid(root, null, null)){
        System.out.println("Valid");
       }else{
       System.out.println("NOt valid");
       }
        root=createBST(value, 0, value.length-1);
    System.out.println(root);
     inOrder(root);


    }
}

