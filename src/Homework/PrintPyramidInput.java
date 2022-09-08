package Homework;
import javax.swing.JOptionPane;
// PrintPyramid.java: Print a pyramid of numbers
public class PrintPyramidInput {
  /** Main method */
  public static void main(String[] args) {
	String dataString = JOptionPane.showInputDialog(null, 
         "Enter number of lines",
         "Pyramid", JOptionPane.QUESTION_MESSAGE);

    int NUM_OF_LINES = Integer.parseInt(dataString);
    
    for (int row = 1; row <= NUM_OF_LINES; row++) {
      // Print leading spaces
      for (int column = 1; column <= NUM_OF_LINES - row; column++)
        System.out.print(" ");

      // Print leading numbers
      for (int num = row; num >= 1; num--)
        System.out.print(num);

      // Print ending numbers
      for (int num = 2; num <= row; num++)
        System.out.print(num);

      // Start a new line
      System.out.println();
    }
  }
}