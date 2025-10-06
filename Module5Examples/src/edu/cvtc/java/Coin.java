package edu.cvtc.java;

public class Coin {

  // Attribute
  private int coinAmount;

  // Constant
  private final int MIN_AMOUNT = 0;

  // Constructors
  public Coin() {}

  public Coin(int coinAmount) {
    setCoinAmount(coinAmount);
  }

  // Getter and Setter
  public int getCoinAmount() {
    return coinAmount;
  }

  public void setCoinAmount(int coinAmount) {
    this.coinAmount = coinAmount;
  }

  // Custom Methods
  public void addAmount(int amount) {
    coinAmount += amount;
  }

  public void subtractAmount(int amount) {
    if ((coinAmount - amount) > MIN_AMOUNT) {
      coinAmount -= amount;
    }
  }

  // toString
  @Override
  public String toString() {
    String retVal = "";

    retVal += "Number of Coins: " + getCoinAmount() + "\n";

    return retVal;
  }
}
