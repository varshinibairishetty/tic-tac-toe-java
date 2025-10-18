// Add Two Matrices in Java
public class MatrixAdditionEx{
    public static void main(String args[]){
        //creating two matrices
        int x[][]={{4,5,2},{7,4,6},{2,4,1}};
        int y[][]={{5,3,8},{2,9,3},{1,2,8}};
        //creating another matrix to store the sum of two matrices
        int z[][]=new int[3][3];  //3 rows and 3 columns
        //adding and printing addition of 2 matrices
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                z[i][j]=x[i][j]+y[i][j];    //use - for subtraction
                System.out.print(z[i][j]+" ");
            }
            System.out.println();//new line
        }
    }
}
