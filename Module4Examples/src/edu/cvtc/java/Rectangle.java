package edu.cvtc.java;

public class Rectangle {

  // Attributes
  private double width;
  private double length;

  // Default Constructor
  public Rectangle() {
    setWidth(0.0);
    setLength(0.0);
  }

  // Overloaded Constructor
  public Rectangle(double width, double length) {
    setWidth(width);
    setLength(length);
  }

  // Methods
  public void setWidth(double width) {
    // Insure only positive numbers are set.
    // If a zero or negative number is passed in, return 0.
    if (width <= 0.0) {
      this.width = 0.0;
    } else {
      this.width = width;
    }
  }

  public double getWidth() {
    return width;
  }

  public void setLength(double length) {
    // Insure only positive numbers are set.
    // If a zero or negative number is passed in, return 0.
    if (length <= 0.0) {
      this.length = 0.0;
    } else {
      this.length = length;
    }
  }

  public double getLength() {
    return length;
  }

  public double getArea() {
    return getWidth() * getLength();
  }

  @Override
  public String toString() {
    String retVal = "";

    retVal += "<!DOCTYPE html>\n" +
        "<html lang=\"en\">\n" +
        "<head>\n" +
        "  <meta charset=\"UTF-8\">\n" +
        "  <title>Java Demo</title>\n" +
        "</head>\n" +
        "<body>\n" +
        "  <h2>Rectangle</h2>\n" +
        "  <p>Length: " + getLength() + "</p>\n" +
        "  <p>Width: " + getWidth() + "</p>\n" +
        "  <p>Area: " + getArea() + "</p>\n" +
        "</body>\n" +
        "</html>";

//    if (getArea() <= 0.0) {
//      retVal = "Area is less than 0.";
//    } else {
//      retVal += "Length: " + getLength() + "\n";
//      retVal += "Width: " + getWidth() + "\n";
//      retVal += "Area: " + getArea() + "\n";
//    }


    return retVal;
  }
}
