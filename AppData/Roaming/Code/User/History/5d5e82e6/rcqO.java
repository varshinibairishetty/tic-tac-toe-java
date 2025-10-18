

 public class fact {
    // Method to calculate factorial
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int bc(int n,int r){
       int fact_n=fact(n);
       int fact_n=fact(r);
       int fact_nmr=fact(n-r);
       int bc=fact_n / (fact_r * fact_nmr);
       return bc;
    }

    // Main method
    public static void main(String[] args) {
        // Print the result of fact(5)
       // System.out.println(fact(5));
        
        // Print the result of fact(4)
       // System.out.println(fact(4));
        System.out.println(bc(5,2));
    }
}
