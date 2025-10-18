

 public class fact {
    // Method to calculate factorial
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // Main method
    public static void main(String[] args) {
        // Print the result of fact(5)
        System.out.println(fact(5));
        
        // Print the result of fact(4)
        System.out.println(fact(4));
    }
}
