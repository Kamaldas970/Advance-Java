package Arrays;

public class Subpairs {

    public static void Subpairs(int nums[]) {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        int Currsum=0;
        for (int i = 0; i < nums.length; i++) {

            int start = i;

            for (int j = i; j < nums.length; j++) {

                int end = j;
             

                for (int k = start; k <= end; k++) {
                 

                    System.out.print(nums[k]+ " ");
                }
                System.out.println();

                
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10, 12, 14, 1};
        Subpairs(nums);
    }
}
