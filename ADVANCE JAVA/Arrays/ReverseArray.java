package Arrays;

public class ReverseArray{
    public static void Reverse(int nums[]){
        int first=0 , last=nums.length-1;

        while(first<=last){
            int temp=nums[last];
            nums[last]=nums[first];
          =

            nums[first]=temp;
               first++;
            last--;
        }

    }
    public static void main(String args[]){
        int nums[]={2,4,6,8,10,12,14};

        Reverse(nums);

        for(int i=0;i<=nums.length-1;i++){
            System.out.println(nums[i]);
        }

    }
}