package edu.cvtc.java;

import java.util.Scanner;

public class TestAverage {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String repeat = "N";
    double testScore = 0;
    double average = 0;
    double total = 0;

    do {
      System.out.print("Please enter the first score: ");
      testScore = keyboard.nextDouble();
      total += testScore;

      System.out.print("Please enter the second score: ");
      testScore = keyboard.nextDouble();
      total += testScore;

      System.out.print("Please enter the third score: ");
      testScore = keyboard.nextDouble();
      total += testScore;

      average = total / 3;
      System.out.println("The average is: " + average);

      System.out.print("Enter 'Y' to continue entering scores: ");
      repeat = keyboard.next();

    } while (repeat == "Y");

  }

}
