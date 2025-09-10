package edu.cvtc.java;

import java.util.Scanner;

public class SoccerTeams {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    int numberOfPlayers = 0;

    System.out.print("Enter the number of players: ");
    numberOfPlayers = keyboard.nextInt();

    while (numberOfPlayers < 10 || numberOfPlayers > 15) {
      System.out.println("The number of players must be between 10 and 15.");
      System.out.print("Enter the number of players: ");
      numberOfPlayers = keyboard.nextInt();
    }

  }

}
