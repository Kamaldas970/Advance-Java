package Arrays;

public class LargestArray {

    public static int LargestArray(int nums[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int start = 0, end = nums.length;

        for (int i = 0; i < end; i++) {
            if (nums[i] < largest) {
                smallest = nums[i];
            } else {
                largest = nums[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int nums[] = {12, 2, 4, 6, 8, 10, 18};
        int largest = LargestArray(nums);

        System.out.println(largest);
    }
}
