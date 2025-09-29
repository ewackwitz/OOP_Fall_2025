package edu.cvtc.java;

import java.util.Scanner;

public class StringAnalyzer {

  public static void main(String[] args) {

    // Variables
    String input;
    char[] chars;
    int letters = 0;
    int digits = 0;
    int whitespaces = 0;

    // Scanner
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Please enter a string: ");
    input = keyboard.nextLine();

    // Convert the string to a character array
    chars = input.toCharArray();

    // Analyze the characters (for a password?)
    for (int i = 0; i < chars.length; i++) {
      if (Character.isLetter(chars[i])) {
        letters++;
      } else if (Character.isDigit(chars[i])) {
        digits++;
      } else if (Character.isWhitespace(chars[i])) {
        whitespaces++;
      }
    }

    System.out.println("Number of letters: " + letters);
    System.out.println("Number of digits: " + digits);
    System.out.println("Number of whitespaces: " + whitespaces);


    keyboard.close();

  }

}
