package Arrays;

public class SubArray{
    public static void subarray(int nums[]){
        for(int i=0;i<=nums.length-1;i++){

            for(int j=i+1;j<nums.length;j++){
                for(int k=i; k<=j;k++){
                    System.out.print(nums[k]+ " ");
                }
                System.out.println("");
            }

            System.out.println("");
            
        }
    }
    public static void main(String args[]){
        int nums[]={2,4,6,8,10,12};
        subarray(nums);
    }
}