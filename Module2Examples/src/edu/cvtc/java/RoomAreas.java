package edu.cvtc.java;

public class RoomAreas {

  public static void main(String[] args) {

    Rectangle kitchen = new Rectangle();
    Rectangle bedroom = new Rectangle();
    Rectangle bathroom = new Rectangle();

    kitchen.setWidth(10.5);
    kitchen.setLength(12.7);

    bedroom.setWidth(18.6);
    bedroom.setLength(15.3);

    bathroom.setWidth(11.3);
    bathroom.setLength(9.3);

    System.out.println("The area of the kitchen is " + kitchen.getArea());
    System.out.println("The area of the bedroom is " + bedroom.getArea());
    System.out.println("The area of the bathroom is " + bathroom.getArea());

  }

}
