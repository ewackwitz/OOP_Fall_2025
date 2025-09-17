package edu.cvtc.java;

import java.util.Scanner;

public class MenuDemo {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    // Print the menu
//    String menuText = "Demonstration Menu\n" +
//        "1. Print 'Yes'\n" +
//        "2. Print 'No'\n" +
//        "3. Exit\n\n" +
//        "Enter your choice (1-3): ";

    String menuText = """
        1. Waffles
          2. Pancakes
        3. Exit
        """;

    int menuChoice = -1;

    do {
      System.out.print(menuText);
      menuChoice = keyboard.nextInt();

      // Validate the response from the user
      while (menuChoice < 1 || menuChoice > 3) {
        System.out.println("\nPlease enter a valid choice\n");
        System.out.print(menuText);
        menuChoice = keyboard.nextInt();
      }

      // Do the selection based upon user input
      if (menuChoice == 1) {
        System.out.println("\n'Yes'\n");
      } else if (menuChoice == 2) {
        System.out.println("\n'No'\n");
      }

    } while (menuChoice != 3);

    keyboard.close();

  }

}
