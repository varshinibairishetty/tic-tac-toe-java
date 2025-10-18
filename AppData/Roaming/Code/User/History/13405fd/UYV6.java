import java.util.*;
public class selectionsort {
    
}
static void selection(int[] arr){
      for(int i=0;i<arr.length;i++){
        //find the max item in the remaining array and swap them
        int end=arr.length-i-1;
        int max=maxindex(arr,0,end);
        swap(arr,max,end);
      }
}
static void swap(int[]arr,int first,int last){
    int temp=arr[first];
    arr[first]=arr[last];
    arr[last]=temp;
}
private static int maxindex(int[] arr,int start,int end){
    int max=start;
    for(int i=1;i<=end;i++){
        if(arr[max]<arr[i]){
            max=i;
        }
    }
    return max;
}