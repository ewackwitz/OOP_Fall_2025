package edu.cvtc.java;

public class InventoryItem {

  // Attributes
  private String description;
  private int units;

  // Default Constructor
  public InventoryItem() {
  }

  // Overloaded Constructor
  public InventoryItem(String description, int units) {
    setDescription(description);
    setUnits(units);
  }

  // Methods
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getUnits() {
    return units;
  }

  public void setUnits(int units) {
    this.units = units;
  }
}
