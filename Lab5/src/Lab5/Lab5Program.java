package Lab5;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Lab5Program 
{

	public static void main(String[] args) throws IOException
	{
	
		String[] wordArray = GetArray("input.txt");
		String isOrIsNot, inputWord;
		while(true)
		{
			// This line asks the user for input by popping out a single window
			// with text input
			inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
			if(inputWord.equals("STOP"))
			{
				System.exit(0);
			}
			// if the inputWord is contained within wordArray return true
			if (wordIsThere(inputWord, wordArray)) 
				isOrIsNot = "is"; // set to is if the word is on the list
			else
				isOrIsNot = "is not"; // set to is not if the word is not on the list
			
			// Output to a JOptionPane window whether the word is on the list or not
			JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
		}
			
	} //main

	public static boolean wordIsThere(String findMe, String[] theList) 
	{
		for(int i = 0; i < theList.length; i++)
		{
			if(findMe.equals(theList[i]))
			{
				return true;
			}
		}
		return false;
	}
	
	public static String[] GetArray(String filename) throws IOException
	{
		int size = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
		while(br.readLine() != null)
		{
			size++;
		}
		String [] s = new String[size];
		br.close();
		br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
		for(int i = 0; i < size; i++)
		{
			s[i] = br.readLine();
		}
		br.close();
		return s;
	}
} 