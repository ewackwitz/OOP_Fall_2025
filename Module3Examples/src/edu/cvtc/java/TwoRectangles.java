package edu.cvtc.java;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TwoRectangles {

  public static void main(String[] args) throws FileNotFoundException {

    Rectangle box1 = new Rectangle();

    box1.setWidth(-7.79);
    box1.setLength(5.37);


    Rectangle box2 = new Rectangle(10.68, 12.53);

    // These two statements will produce the exact same result
    //
//    System.out.println(box1);

    // Create an output file
    PrintWriter htmlFile = new PrintWriter("test.txt");

    System.out.println(box1);


  }

}
