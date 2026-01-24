package Recursions;
public class printInc{
    public static void printInc(int n){
    //     if(n==10){
    //         System.out.println(10);
    //         return;
    //     }
    //     System.out.println(n + " ");
    //     printInc(n+1);
    // }
    if(n==1){
        System.out.print(n + " ");
        return;
    }
    printInc(n-1);
    System.out.print(n + " ");
    
    }
    public static void main(String args[]){
        int n=10;

        printInc(n);
    }

}