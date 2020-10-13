import java.util.Scanner;
/**
 * This program calculates vectors
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner for user input
    Scanner input = new Scanner(System.in);

    //Asks the user to input three numbers
    System.out.println("Please enter the 3 values for the first vector");

    // Sets an array for the first three numbers
    int[] vectorNum = new int[3];

    // using for loop gets the inputs from the user
    for(int i = 0; i < vectorNum.length; i++){
      vectorNum[i] = input.nextInt();
    }

    // Asks the user to input another three numbers
    System.out.println("Please enter the 3 values for the second vector");

    // sets an array for the second three numbers
    int[] vectorNum2 = new int[3];

    // gets the inputs from the user for the second time
    for(int i = 0; i < vectorNum2.length; i++){
      vectorNum2[i] = input.nextInt();
    }

    // calculates x, y, zs mutiplied together
    int xAnswer = vectorNum[0] * vectorNum2[0];
    int yAnswer = vectorNum[1] * vectorNum2[1];
    int zAnswer = vectorNum[2] * vectorNum2[2];

    // adds all of them and tells the user the answer
    System.out.println("The dot product is " + (xAnswer + yAnswer + zAnswer));
  }
}
