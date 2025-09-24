package edu.cvtc.java;

public class SubClass2 extends SuperClass2 {

  @Override
  public void showValue(int argument) {
    System.out.println("SUBCLASS int is: " + argument * 2);
  }

  public void showValue(double argument) {
    System.out.println("SUBCLASS double is: " + argument);
  }


}
