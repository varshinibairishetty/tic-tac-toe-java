import java.util.*;
class main{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);

String name="varshini";
char target="v";
System.out.println(search(name,target));
    }

static boolean linearsearch(String str, char target){
  if(str.length()==0){
    return false;
  }
  for(int i=0;i<str.length();i++){
    if(target==str.charAt(i)){
        return true;
    }
  }
  return false;
}
}
    


