

public class Binarysearch {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62};
        int target = 25;

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (array[mid] == target) {
                return mid;
            }

            // If target is greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target not present
        return -1;
    }
}
