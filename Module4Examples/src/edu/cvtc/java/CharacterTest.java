package edu.cvtc.java;

import java.util.Scanner;

public class CharacterTest {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter a character: ");
    String character = keyboard.nextLine();

    if(Character.isLetter(character.charAt(0))) {
      System.out.println(character + " is a letter");
    }

    if(Character.isDigit(character.charAt(0))) {
      System.out.println(character + " is a digit");
    }

    if(Character.isUpperCase(character.charAt(0))) {
      System.out.println(character + " is a uppercase");
    }

    if(Character.isLowerCase(character.charAt(0))) {
      System.out.println(character + " is a lowercase");
    }

    if(character.charAt(0) == '$') {
      System.out.println(character + " is a $");
    }

    keyboard.close();


  }

}
