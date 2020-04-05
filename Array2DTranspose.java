//***************************************************
//
//Code by Jauharul Arifin
//Array2DTranspose.java
//***************************************************
public class Array2DTranspose{
   public static void main(String[] args) {

      //giving value for 2D array 3x3 and initialize [][]b
      int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
      int [][]b = new int [3][3];

      //print the result before transpose
      //expected output
      //1  2  3
      //4  5  6
      //7  8  9

      System.out.println("Array 3x3 Before Transpose :");
      for(int row =0; row<a.length; ++row){
         for(int col=0; col<a[row].length; ++col){
            System.out.print(a[row][col]+ "  ");
         }
         System.out.println();
      }

      // This function stores transpose
       // of a[][] in b[][]
      //first row becomes the first column,
      //the second row becomes the second column,
      //and the third row becomes the third column.

      //expected output
      //1  4  7
      //2  5  8
      //3  6  9

      for (int row = 0; row < a.length; ++row) {
            for (int col = 0; col < a[row].length; ++col)
                b[row][col] = a[col][row];
       }


      // print out transposed matrix
        System.out.println();
        System.out.println("Array 3x3 After Transpose :");
        for (int row = 0; row < b.length; ++row) {
            for (int col = 0; col < b[row].length; ++col) {
                System.out.print(b[row][col]+ "  ");
            }
            System.out.println();
        }
   }
}
