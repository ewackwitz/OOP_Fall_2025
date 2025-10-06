package edu.cvtc.java;

public class Penny extends Coin {

  // Constant
  private final int MIN_AMOUNT = 5;

  // Constructors
  public Penny() {}

  public Penny(int coinAmount) {
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

    retVal += "Number of Pennies: " + getCoinAmount() + "\n";

    return retVal;
  }

}
