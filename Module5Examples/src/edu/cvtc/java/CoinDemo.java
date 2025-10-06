package edu.cvtc.java;

public class CoinDemo {

  public static void main(String[] args) {
    // Declare Objects
    Coin penny = new Penny(15);
    Coin nickel = new Nickel(20);
    Coin quarter = new Quarter(25);

    // Declare and fill an array
    Coin coins[] = {penny, nickel, quarter};

    System.out.println("Subtracting [2] from coins.");

    for (int i = 0; i < coins.length; i++) {
      System.out.println(coins[i]);
      coins[i].subtractAmount(2);
      System.out.println(coins[i]);
      System.out.println();
    }

    System.out.println("Subtracting [4] from coins.");

    for (int i = 0; i < coins.length; i++) {
      System.out.println(coins[i]);
      coins[i].subtractAmount(4);
      System.out.println(coins[i]);
      System.out.println();
    }

    System.out.println("Subtracting [10] from coins.");

    for (int i = 0; i < coins.length; i++) {
      System.out.println(coins[i]);
      coins[i].subtractAmount(10);
      System.out.println(coins[i]);
      System.out.println();
    }

  }

}
