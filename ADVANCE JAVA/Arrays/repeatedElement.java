package Arrays;

public class repeatedArrays{

    public static boolean repeat(int nums[]){
        int first=0, last=nums.length-1;

      
            for(int i=0;i<last;i++){
                for(int j=i+1;j<last;j++){

                

                if(nums[i]==nums[j]){
                    return true;
                }
                }
            }
            return false;
        }
    
    public static void main(String args[]){
        int nums[]={2,4,6,8,10,12,18};

        boolean repeated=repeat(nums);
        System.out.println(repeated);
    }
}