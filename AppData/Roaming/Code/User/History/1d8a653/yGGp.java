public class solidrombus {
    public static void solidrombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;i<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        solidrombus(5);
    }
}
