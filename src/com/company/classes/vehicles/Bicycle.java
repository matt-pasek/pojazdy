package com.company.classes.vehicles;

import com.company.VehicleColor;
import com.company.classes.engines.BicycleDrive;
import com.company.classes.type.Driving;
import java.math.BigDecimal;

// dziedziczenie klasy - extends
public class Bicycle extends Driving {

  public Bicycle(
    String name,
    BigDecimal price,
    VehicleColor color,
    int maxVelocity,
    BicycleDrive engine
  ) {
    this.name = name;
    this.price = price;
    this.color = color;
    this.maxVelocity = maxVelocity;
    this.engine = engine;
  }

  public Bicycle() {}
}
