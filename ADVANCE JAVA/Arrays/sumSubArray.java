package Arrays;

public class sumSubArray{
    public static void sum(int nums[]){
        int max=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<nums.length;i++){
            int start=i;

            for(int j=i;j<nums.length;j++){
                int end=j;
                currSum=0;
               
               for(int k=start;k<=end;k++){
              

                  currSum+=nums[k];
                  
               }
               System.out.println(currSum + " ");
               if(max<currSum){
                max=currSum;
               }

            }
            
        }
        System.out.println("the total sum is " + max);
    }
    public static void main(String args[]){

        int nums[]={2,4,6,8,10,12};
        sum(nums);
    }
}