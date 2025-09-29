package edu.cvtc.java;

public class TelephoneDemo {

  public static void main(String[] args) {

    String phoneNumberUnformatted = "1234567890";
    String phoneNumberFormatted = "(987) 654-3210";

    System.out.println("Unformatted to Formatted: " +
        Telephone.formatNumber(phoneNumberUnformatted));

    System.out.println("Formatted to Unformatted: " +
        Telephone.unformatNumber(phoneNumberFormatted));

  }

}
