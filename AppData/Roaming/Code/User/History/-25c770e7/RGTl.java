

public class isprime {
    public static boolean isprime(int n){
//      boolean   isprime=true;
//   for(int i=2;i<=n-1;i++){
//     if(n%i==0){
//         isprime=false;
//         break;
//     }
//   }
//   return isprime;
//     }
 for(int i=2;i<=Math.sqrt(n);i++){
  if(n%i==0){
    return false;
  }
}
  return true;

 }

 public static void primesinrange(int n){
  for(int i=2;i<=n;i++){
  if(isprime(i)){
System.out.println(i);
  }
 }
 System.out.println();
}
    public static void main(String[] args){
        // System.out.println(isprime(5));
        // System.out.println(isprime(1));
        // System.out.println(isprime(4));
        System.out.println(primesinrange(20));




    }
  }
