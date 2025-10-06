package edu.cvtc.java;

public class Quarter extends Coin {

  // Constant
  private final int MIN_AMOUNT = 20;

  // Constructors
  public Quarter() {}

  public Quarter(int coinAmount) {
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

    retVal += "Number of Quarters: " + getCoinAmount() + "\n";

    return retVal;
  }

}
