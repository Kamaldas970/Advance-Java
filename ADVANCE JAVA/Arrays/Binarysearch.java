package Arrays;

public class Binarysearch {

    public static int Binarysearch(int key, int arr[]) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 16, 20};
        int key = 4;
        int index = Binarysearch(key, arr);
        System.out.println("the key is found " + index);
    }
}
