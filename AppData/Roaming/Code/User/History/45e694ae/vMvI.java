public class Quicksort {

   
    public static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quicksort(array, low, pivotIndex - 1);  // Recursively sort elements before partition
            quicksort(array, pivotIndex + 1, high); // Recursively sort elements after partition
        }
    }

    
    private static int partition(int[] array, int low, int high) { 
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                // Swap elements
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
       
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {34, 7, 23, 32, 5, 62};
        
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        quicksort(array, 0, array.length - 1);
        
        System.out.println("\n\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
