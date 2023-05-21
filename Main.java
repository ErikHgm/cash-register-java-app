import java.util.Scanner;
import java.util.Date;
import java.util.Arrays;
import java.util.Random;

/**
 * 
 * 
 */
public class Main {
  public static void main(String[] args) {
    while (true) {
      switch (menu()) {
        case 1:
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
    return userinput;
  }

}// end main class
