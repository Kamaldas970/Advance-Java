package Recursions;
public class SortedArray{
    public static boolean Sorted(int arr[],int i){
        int n=arr.length-1;
        if(i==n-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }
        return Sorted(arr, i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,6,5};

       System.out.println( Sorted( arr, 0));
    }
}