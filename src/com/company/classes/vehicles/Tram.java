package com.company.classes.vehicles;

import com.company.VehicleColor;
import com.company.classes.engines.ElectricEngine;
import com.company.classes.type.Driving;
import java.math.BigDecimal;

// dziedziczenie klasy - extends
public class Tram extends Driving {

  public Tram(
    String name,
    BigDecimal price,
    VehicleColor color,
    int maxVelocity,
    ElectricEngine engine
  ) {
    this.name = name;
    this.price = price;
    this.color = color;
    this.maxVelocity = maxVelocity;
    this.engine = engine;
  }

  public Tram() {}
}
