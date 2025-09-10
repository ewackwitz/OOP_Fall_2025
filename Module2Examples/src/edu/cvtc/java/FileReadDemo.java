package edu.cvtc.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {

  public static void main(String[] args) throws FileNotFoundException {

    File file = new File("friends.txt");
    Scanner input = new Scanner(file);

    while (input.hasNextLine()) {
      String line = input.nextLine();
      System.out.println(line);
    }

    input.close();

  }

}
