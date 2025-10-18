public class sum  {
    public class ArraySum {
        public static void main(String[] args) {
            int[] array = {10, 20, 30, 40, 50};
            int targetElement = 30; // Element to find sums around
    
            // Find the index of the target element
            int targetIndex = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == targetElement) {
                    targetIndex = i;
                    break;
                }
            }
    
            if (targetIndex == -1) {
                System.out.println("Element not found in the array.");
                return;
            }
    
            int leftSum = 0;
            int rightSum = 0;
    
            // Calculate left sum
            for (int i = 0; i < targetIndex; i++) {
                leftSum += array[i];
            }
    
            // Calculate right sum
            for (int i = targetIndex + 1; i < array.length; i++) {
                rightSum += array[i];
            }
    
            System.out.println("Left sum: " + leftSum);   // Output: 30
            System.out.println("Right sum: " + rightSum); // Output: 90
        }
    }
    
}
