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

//  public void setPerimiter(double width, double length) {
//    setWidth(width);
//    setLength(length);
//  }
}
