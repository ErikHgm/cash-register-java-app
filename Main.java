import java.util.Scanner;
import java.util.Date;
import java.util.Arrays;
import java.util.Random;

/**
 * 
 * 
 */
public class Main {
  private static Scanner userInput = new Scanner(System.in);
  int[][] articles = new int[10][3];
  int articleNumber = 1000;
  int noOfArticles = 0;

  public static void main(String[] args) {
    while (true) {
      switch (menu()) {
        case 1:
          System.out
              .println("\n----------------------------\n# Enter amount of articles\n----------------------------");
          System.out.print("Enter the amount of items you want to add: ");
          noOfArticles = input();
          articles = insertArticles(articles, articleNumber, noOfArticles);
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          break;
        case 7:
          break;
        default:
          break;
      }
    } // end while loop
  }// end main method

  /**
   * Retrieves the user input.
   *
   * @return an integer
   */
  public static int input() {
    int inputNum = 0;
    while (true) {
      if (userInput.hasNextInt()) {
        inputNum = userInput.nextInt();
        if (inputNum > 0) {
          break;
        } else {
          System.out.println("Please enter a number greater than zero");
        }
      } else if (userInput.hasNext()) {
        String inString = userInput.next();
        if (inString.equalsIgnoreCase("q")) {
          inputNum = 7;
          break;
        } else {
          System.out.println("Please enter a number or q to quit");
        }
      }
    }
    return inputNum;
  }

  /**
   * Displays the menu options and retrieves user input.
   *
   * @return an integer representing the selected option
   */
  public static int menu() {
    System.out.println("\nMain Menu:");
    System.out.println(" 1. Insert articles");
    System.out.println(" 2. Remove an article");
    System.out.println(" 3. Display a list of articles");
    System.out.println(" 4. Register a sale");
    System.out.println(" 5. Display order history");
    System.out.println(" 6. Sort and display order history table");
    System.out.println(" Q. Quit");
    System.out.print("Enter option: ");
    int userinput = input();
    return userinput;
  }

}// end main class
