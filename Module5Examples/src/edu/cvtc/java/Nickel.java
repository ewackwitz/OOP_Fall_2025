package edu.cvtc.java;

public class Nickel extends Coin {

  // Constant
  private final int MIN_AMOUNT = 10;

  // Constructors
  public Nickel() {}

  public Nickel(int coinAmount) {
    setCoinAmount(coinAmount);
  }

  // Getter and Setter are inherited

  // Custom Methods (addAmount is inherited)

  public void subtractAmount(int amount) {
    if ((getCoinAmount() - amount) > MIN_AMOUNT) {
      super.subtractAmount(amount);
    }
  }

  // toString
  @Override
  public String toString() {
    String retVal = "";

    retVal += "Number of Nickels: " + getCoinAmount() + "\n";

    return retVal;
  }

}
