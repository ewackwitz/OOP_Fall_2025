package edu.cvtc.java;

public class PassObject {

  public static void main(String[] args) {

//    InventoryItem inventoryItem = new InventoryItem("Apples", 15);
    InventoryItem inventoryItem = getInventoryItem();

    displayItem(inventoryItem);

    changeItem(inventoryItem);

    displayItem(inventoryItem);

  }

  private static InventoryItem getInventoryItem() {
    return new InventoryItem("Oranges", 12);
  }

//  private static void changeString(String temp) {
//    temp = temp + "a";
//    System.out.println(temp);
//  }

  private static void displayItem(InventoryItem item) {
    System.out.println("Description: " + item.getDescription());
    System.out.println("Units: " + item.getUnits());
  }

  private static void changeItem(InventoryItem item) {
    item.setUnits(20);
  }

}
