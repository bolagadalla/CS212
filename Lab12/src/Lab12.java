import javax.swing.*;
import java.awt.*;
public class Lab12{
   
   static TextFileInput inFile;
   static String inFileName = "numbers.txt";
   static JFrame myFrame;
   static Container cPane;
   static JTextArea even, odd;
   
   public static void main(String[] args) {
      initialize();
      readNumbersFromFile(inFileName);
      
   }   
   public static void initialize() {
      inFile = new TextFileInput(inFileName);
      even = new JTextArea();
      even.setEditable(false);
      odd = new JTextArea();
      odd.setEditable(false);
      myFrame=new JFrame();
      myFrame.setSize(400,400);
      myFrame.setLocation(200, 200);
      myFrame.setTitle("");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setVisible(true);
   }
   public static void readNumbersFromFile(String fileName){
      /*
       * Add code to this method so...
       * - the two text areas are added to the content pane of the JFrame
       *   (see the code in the PowerPoint on GUIs) 
       * - numbers are read from the file, and even numbers are put in 
       *   the TextArea "even", odd numbers in "odd".
       * - At end of file, the JFrame is made visible.
       */
      String line = "";
      myFrame.setLayout(new GridLayout());
      myFrame.getContentPane().add(even);
      myFrame.getContentPane().add(odd);

      String oddNumb = "";
      String evenNumb = "";
      while (line != null) 
      {
          line = inFile.readLine();
    	  if(Integer.parseInt(line) % 2 == 0)
    	  {
    		  evenNumb += line + "\n";
    	      even.setText(evenNumb);
    	  }
    	  else
    	  {
    		  oddNumb += line + "\n";
    	      odd.setText(oddNumb);
    	  }          
      } //while


      myFrame.setVisible(true);
   } //readSSNsFromFile
   
      
   
   
   
} //SSN
