package edu.cvtc.java;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteDemo {

  public static void main(String[] args) throws FileNotFoundException {

    // Variables
    String fileName;
    String friendName;
    int numberOfFriends;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("How many friends? ");
    numberOfFriends = keyboard.nextInt();
    keyboard.nextLine();

    PrintWriter outputFile;

    System.out.print("Please enter your file name: ");
    fileName = keyboard.nextLine();

    outputFile = new PrintWriter(fileName);

    for (int i = 0; i < numberOfFriends; i++) {
      System.out.print("Please enter your friend name: ");
      friendName = keyboard.nextLine();
      outputFile.println(friendName);
    }

    outputFile.close();

    System.out.println("Data was written successfully.");


  }
}
