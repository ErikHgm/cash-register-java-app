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

  public static void main(String[] args) {
    int[][] articles = new int[10][3];
    int articleNumber = 1000;
    int noOfArticles = 0;

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
          System.out.println("Goodbye!");
          System.exit(0);
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

  /**
   * Checks if the articles array has enough free slots to accommodate the
   * specified number of articles.
   * If not, expands the array and returns the expanded array.
   *
   * @param articles     The articles array.
   * @param noOfArticles The number of articles to be inserted.
   * @return The updated articles array.
   */
  public static int[][] checkFull(int[][] articles, int noOfArticles) {
    int freeSlots = 0;
    for (int i = 0; i < articles.length; i++) {
      if (articles[i][0] == 0) {
        freeSlots++;
      }
    }
    if (freeSlots < noOfArticles) {
      return expandArray(articles, noOfArticles - freeSlots);
    }

    return articles;
  }

  /**
   * Expands the size of the articles array by the specified size and returns the
   * expanded array.
   *
   * @param articles The articles array.
   * @param size     The size by which the array should be expanded.
   * @return The expanded articles array.
   */
  public static int[][] expandArray(int[][] articles, int size) {
    int[][] tempArticles = new int[articles.length + size][3];
    System.arraycopy(articles, 0, tempArticles, 0, articles.length);
    return tempArticles;
  }

  /**
   * Inserts articles into the inventory.
   *
   * @param articles      The articles array.
   * @param articleNumber The starting article number.
   * @param noOfArticles  The number of articles to insert.
   * @return The updated articles array.
   */

  public static int[][] insertArticles(int[][] articles, int articleNumber, int noOfArticles) {
    int quantity = 0;
    int price = 0;
    int arrayTracker = 0;

    // Insert specified number of articles into the inventory
    for (int i = 0; i < noOfArticles; i++) {
      for (int row = arrayTracker; row < articles.length; row++) {
        // Find the first available row in the articles array
        if (articles[row][0] == 0) {
          // Generate random quantity and price
          quantity = (int) (Math.random() * 9) + 1;
          price = (int) (Math.random() * 199) + 1;

          // Assign article details to the row
          articles[row][0] = articleNumber + row;
          articles[row][1] = quantity;
          articles[row][2] = price;
          arrayTracker = row;
          break;
        }
      }
    }
    System.out.println("Thank you, " + noOfArticles + " items have been successfully added to the inventory!");
    return articles;
  }
}// end main class
