package edu.cvtc.java;

public class Telephone {

  public final static int FORMATTED_LENGTH = 14;
  public final static int UNFORMATTED_LENGTH = 10;

  public static boolean isFormatted(String formatted) {
    boolean isValid;

    if (formatted.length() == FORMATTED_LENGTH &&
        formatted.charAt(0) == '(' &&
        formatted.charAt(4) == ')' &&
        formatted.charAt(9) == '-') {
      isValid = true;
    } else {
      isValid = false;
    }

    return isValid;
  }

  public static String unformatNumber(String phoneNumber) {
    // Use a String Builder object for replacement
    StringBuilder unformatted = new StringBuilder(phoneNumber);

    if (isFormatted(phoneNumber)) {
      // Delete the '-' at position 9
      unformatted.deleteCharAt(9);

      // Delete the space at position 5
      unformatted.deleteCharAt(5);

      // Delete the ')' at position 4
      unformatted.deleteCharAt(4);

      // Delete the '(' at position 0
      unformatted.deleteCharAt(0);
    }

    return unformatted.toString();
  }

  public static String formatNumber(String phoneNumber) {
    // Use a String Builder object for replacement
    StringBuilder formatted = new StringBuilder(phoneNumber);

    // If the string is unformatted, then format it
    if (phoneNumber.length() == UNFORMATTED_LENGTH) {
      // Insert the "(" at position 0
      formatted.insert(0, "(");

      // Next, insert the "( " starting at position 4
      formatted.insert(4, ") ");

      // Next, insert the hyphen at position 9
      formatted.insert(9, "-");
    }

    return formatted.toString();

  }
}
