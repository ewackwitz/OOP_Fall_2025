package edu.cvtc.java;

public class RectangleDemo {

  public static void main(String[] args) {
    Rectangle room = new Rectangle();

    room.setWidth(40.0);
    room.setLength(56.33);

    double area = room.getArea();

    System.out.println
        ("The area of the rectangle is " + area);

  }

}
