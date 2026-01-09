package Arrays;

public class Linearsearch {

    public static int Linearsearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 14, 16, 19};

        int key = 16;

        int index = Linearsearch(arr, key);

        if (index == -1) {
            System.out.println("Key was not found");
        } else {
            System.out.println("Key found at index" + index);
        }

    }
}
