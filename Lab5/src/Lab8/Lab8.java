package Lab8;

import java.util.StringTokenizer;

public class Lab8
{
   public static int numbs[][] = FillArray("twodimension8.txt");
   
   public static void main(String[] args)
   {
	   PrintArray(numbs);
   }
   
   public static int[][] FillArray(String file)
   {
	      // Create a BufferedReader object calling it myLine
	      TextFileInput myFile = new TextFileInput(file);
	      // We read the very first line
	      String line = myFile.readLine();
	      // We check if that line has a token which is ","
	      StringTokenizer myTokens = new StringTokenizer(line, ",");
	      // Starts by getting the first word between the token ","
	      int row = Integer.parseInt(myTokens.nextToken());
	      int col = Integer.parseInt(myTokens.nextToken());
	      // Initialize the array
	      int numbs[][] = new int[row][col];
	      
	      // Loop through the other lines and look at the words between the tokens
	      for (int i = 0; i < numbs.length; i++)
	      {     
	    	 line = myFile.readLine();
	         myTokens = new StringTokenizer(line, ",");
	         for (int j = 0; j < numbs[i].length; j++)
	         {
	               numbs[i][j] = Integer.parseInt(myTokens.nextToken());
	         }
	      }
	      myFile.close();
	      return numbs;
   }
   
   // Prints a number
   private static void display (int num)
   {
      System.out.print(num+" ");
   }
   
   public static void PrintArray(int[][] theArray)
   {
	      for (int i=0; i<theArray.length; i++) 
	      {
	         for (int j=0; j<theArray[i].length;j++)
	            display(theArray[i][j]);
	         System.out.println();
	      }
   }
}
