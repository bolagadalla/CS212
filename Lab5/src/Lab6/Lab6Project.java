package Lab6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Lab6Project 
{
	public static void main(String[] args) throws Exception
    { 
        int[] numbArray = GetInteger("lab6input.txt");
        String inputWord;

        // Loops indefinitely until user enters STOP
        while (true) 
        {
            inputWord = JOptionPane.showInputDialog(null, "Enter 'sum' or 'average' in all lower case:");
            switch (inputWord) 
            {
                case "sum":
                    JOptionPane.showMessageDialog(null, "The sum of the array is: " + sum(numbArray, numbArray.length));
                    break;
                
                case "average":
                    JOptionPane.showMessageDialog(null, "The average of the array is: " + average(numbArray, numbArray.length));
                    break;

                case "STOP":
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Please only enter 'sum' or 'average'.\nIf you want to exit the program enter 'STOP'.");
                    break;
            }
        }
    }
	
	// Gets the number string in the file and convert it to a integer and add it to array
    public static int[] GetInteger(String filename) throws Exception
    {
        // array size
        int size = 0;
        
        // Creates a new BufferedReader object to read the filename lines
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));

        // While loop to count the number of lines in the file
        while(br.readLine() != null)
        {
            size++;
        }
        br.close(); // Close file
        // number array
        int numbs[] = new int[size];
        
        // Reinstanciate the BufferedReader object
        br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        // Goes through the file and read every line and convert it into an interger and assign it to the numbs[i] array
        for(int i = 0; i < size; i++)
        {
            numbs[i] = Integer.parseInt(br.readLine());
        }
        br.close(); // Close file

        // Return the array of numbers
        return numbs;
    }
    
    // Calculates the sum of all the integers in the array
    public static int sum(int[] myArray, double myArraySize)
    {
        // Holds the sum of the array
        int sumOfArray = 0;
        // Loops through the array and adds the integers to sumOfArray
        for(int i = 0; i < myArray.length; i++)
        {
            sumOfArray += myArray[i];
        }
        // Returns the sum
        return sumOfArray;
    }

    // Gets the average of the array
    public static double average(int[] myArray, double myArraySize)
    {
        // Calls the sum function to calculate the sum and then divide it by the myArraySize
        return sum(myArray, myArraySize) / myArraySize;
    }
}
