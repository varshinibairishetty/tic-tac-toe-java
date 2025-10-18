import java.util.*;
class main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int []nums={23,45,1,38,2,56,7};
    int target=0;
    int ans=linearsearch(nums,target);
    System.out.println(ans);
}
    
    static int linearsearch(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
    
}

