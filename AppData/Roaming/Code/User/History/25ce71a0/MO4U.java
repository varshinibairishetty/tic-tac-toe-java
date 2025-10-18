public class hallowrectangle {
    public static void hallowrectange(int row,int col){
        for(int i=0;i<row;i++ ){
            for(int j=0;i<col;j++){
                if(i==1||j==1||i==row||j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
        public static void main(String[] args){
            hollowrectangle(3,5);
        }
    }

