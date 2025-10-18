public class bintodecimal {
    public static void bintodecimal(int bin){
        int num=bin;
 int dec=0;
 int pow=0;
 while(bin>0){
     int ld=bin%10;
      dec=dec+(ld*(int)Math.pow(2,pow));
      pow++;
      bin=bin/10;
 } 
 System.out.println("decimal of "+ num+" is ="+dec);
}
 public static void main(String[] args){
    bintodecimal(1111);
 }
    }

