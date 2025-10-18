public class dectobin {
   public static void dectobin(int n){
    int num=n;
    int pow=0;
    int bin=0;
    while(n>0){
        int rem=n%2;
        int bin=bin+(rem*(int)Math.pow(10,pow));
        pow++;
        n=n/2;
    }
    System.out.println("binary of"+num+" is" bin);
   } 
   public static void main(String[] args){
     dectobin(12);
   }
}
