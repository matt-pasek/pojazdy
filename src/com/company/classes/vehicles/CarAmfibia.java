package com.company.classes.vehicles;

import com.company.VehicleColor;
import com.company.classes.engines.CombustionEngine;
import com.company.classes.interfaces.swimming;
import com.company.classes.type.Driving;
import java.math.BigDecimal;

// dziedziczenie klasy - extends        // implementacja interfejsu - implements
public class CarAmfibia extends Driving implements swimming {

  public CarAmfibia(
    String name,
    BigDecimal price,
    VehicleColor color,
    int maxVelocity,
    CombustionEngine engine
  ) {
    this.name = name;
    this.price = price;
    this.color = color;
    this.maxVelocity = maxVelocity;
    this.engine = engine;
  }

  public CarAmfibia() {}
}
