package Lab7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab7 
{
   public static void main(String[] args) throws Exception
   {
      int[][] myArray = fillArray("twodimesion.txt");
      printArray(myArray);
      System.out.println();
      printArrayEven(myArray);
   }

   // Prints the array row by row and col by col
   private static void printArray (int[][] theArray) 
   {
      for (int i=0; i<theArray.length; i++) 
      {
         for (int j=0; j<theArray[i].length;j++)
            display(theArray[i][j]);
         System.out.println();
      }
   }

   // Prints a number
   private static void display (int num)
   {
      System.out.print(num+" ");
   }

   // Prints the array but replaces any odd number with "*"
   private static void printArrayEven(int[][] theArray)
   {
      for (int i = 0; i < theArray.length; i++)
      {
         for (int j = 0; j < theArray[i].length; j++)
         {
           // If any number in the array that is divided and does not return 0 as a remainder then it is an odd number, replace it with "*"
            if (theArray[i][j] % 2 != 0)
            {
               System.out.print("* ");
               continue;
            }
            display(theArray[i][j]);
         }
         System.out.println();
      }
   }
   
   // Fills the array by reading the first two line to declare the size of the array and the reset into the returned array s
   public static int[][] fillArray(String myFile) throws IOException
   {
     // Creates the BufferedReader object
      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(myFile)));
      // Saves the first line
      String firstLn = br.readLine();
      // Saves the second line
      String secondLn = br.readLine();

      // Converts both the first and second lines to rows and cols integers
      int row = Integer.parseInt(firstLn);
      int col = Integer.parseInt(secondLn);

      // declare the array using the row and col created
      int s[][] = new int[row][col];
      // Adds all the numbers from myFile into the 2D array
      for (int i = 0; i < row; i++)
      {
         for (int j = 0; j < col; j++)
         {
            s[i][j] = Integer.parseInt(br.readLine());
         }
      }
      br.close();
      return s;
   }
   
//   // Helps visulize the array created
//   private static void PrintArrays(int[][] arr)
//   {
//      System.out.print("{ ");
//      for (int i = 0; i < arr.length; i++)
//      {
//         System.out.print("{ ");
//         for (int j = 0; j < arr[i].length; j++)
//         {
//            System.out.print(arr[i][j] + ", ");
//         }
//         System.out.print(" }");
//      }
//      System.out.print(" }");
//   }
}