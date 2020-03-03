
import java.awt.GridLayout;
import javax.swing.*;        

public class Lab11 {
    
   public static void main(String[] args) {
        createAndShowGUI();
   }
   
   private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 100,100);//width, height);
        frame.setLocation(850,350);//x, y);
        frame.setLayout(new GridLayout(2,1));

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);
        JLabel label = new JLabel();
        
        readAndDisplayMatrix(frame, textArea, label);
    }
   
   private static void readAndDisplayMatrix(JFrame myFrame, JTextArea myText, JLabel myLabel) 
   {
	   // The matrix to print
	   int[][] myMatrix = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
	   
	   // String to hold the text for the textArea
	   String textInTextArea = "";
	   // Sum of all elements in the matrix
	   int sum = 0;
	   // Loops through the matrix
	   for (int i = 0; i < myMatrix.length; i++) 
	   {
		   for (int j = 0; j < myMatrix[i].length; j++) 
		   {
			   // Adds the current index of the matrix to the string variable
			   textInTextArea += myMatrix[i][j] + " ";
			   sum += myMatrix[i][j];
		   }
		   // Inserts a new line at the end of every i loop
		   textInTextArea += "\n"; 
	   }
	   // Sets all the approbate variable
	   myText.setText(textInTextArea);
	   myLabel.setText("The sum is: " + sum);
	   myFrame.getContentPane().add(myLabel);
	   
	   //Display the window
	   myFrame.pack();
	   myFrame.setVisible(true);
   }

        
}