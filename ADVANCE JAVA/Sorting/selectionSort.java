package Sorting;

public class selection{
    public static void sort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minpos]>nums[j]){
                    minpos=j;
                }
            }
            int temp=nums[minpos];
            nums[minpos]=nums[i];
            nums[i]=temp;
        }
    }

    public static void arr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int nums[]={5,4,1,3,2};
        sort(nums);
        arr(nums);
    }
}