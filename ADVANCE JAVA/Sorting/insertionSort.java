package Sorting;

public class insertion{

    public static void sort(int nums){
        for(int i=0;i<nums.length-i++){
            int curr=arr[i];
            for(int j=0;j<nums.length;j++){
                int prev=i-1;

                while(prev>=0&& arr[prev]>curr){
                    arr[prev+1]=arr[prev];
                    prev--;
                }
            }
            
        }
    }
    public static void main(String args[]){
        int nums[]={5,4,1,3,2};
    }
}