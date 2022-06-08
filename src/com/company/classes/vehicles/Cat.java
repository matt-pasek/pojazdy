package com.company.classes.vehicles;

import com.company.classes.parent.Entity;
import java.math.BigDecimal;

// dziedziczenie klasy - extends
public class Cat extends Entity {

  public Cat(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }

  public Cat() {}
}
