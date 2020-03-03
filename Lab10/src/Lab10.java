/***************************************************************
 * 
 * @author K. Lord
 * A program that works with two-dimension arrays.
 * It fills the matrix with values and then prints to the console the sum of the matrix and also the sum of the rows of the matrix
 */
public class Lab10 {
  private static int[][] matrix;
   
   public static void main(String[] args){
      matrix = new int[6][4];
      fillMatrix(matrix, 5);
      System.out.println(sumMatrix(matrix));
   }
   /**
    * Each cell of an integer matrix is filled with
    * the given value.
    *  
    * @param m The matrix to be filled
    * @param v The value to fill in each cell
    */
   public static void fillMatrix(int[][] m, int v){
      for (int i=0;i<m.length;i++)
         for (int j=0; j<m[i].length; j++)
            m[i][j]=v;
   }
   
   /**
    * It fills the 2D array
    * It will fill the 2D array with the seqValue and increment it by 1 after assigning it to the array index
    * 
    * @param m The matrix to be filled
    * @param v The value to fill in each cell
    */
   public static void fillMatrixSeq(int[][] m, int v){
      int seqValue=0;
      for (int i=0;i<m.length;i++)
         for (int j=0; j<m[i].length; j++)
            m[i][j]=seqValue++;
   }
   
   /**
    * Adds all the value of the matrix together
    * Creating a sum variable of type int and we are adding the value of the matrix into it and returning that sum
    * 
    * @param m The 2D array matrix to get the values from and adds them
    * @return Returns the sum of all the value as an integer
    */
   public static int sumMatrix(int[][] m){
      int sum = 0;
      for (int i=0;i<m.length;i++)
         for (int j=0; j<m[i].length; j++)
            sum += m[i][j];
      return sum;
   }
   
   /**
    * Adds the value of the rows in the matrix
    * Creates a sum variable of type integer and adds the value of the row in the matrix into it and returning that sum
    * 
    * @param m The 2D matrix the to get the row value from and adds them
    * @return Returns the sum of the rows in the matrix as an integer
    */
   public static int sumMatrixRow (int[][] m){
      int sum = 0;
      for (int i=0;i<m.length;i++)
         for (int j=0; j<m[i].length; j++)
            sum += m[i][j];
      return sum;
   }
}
