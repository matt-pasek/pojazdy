package com.company.classes.vehicles;

import com.company.VehicleColor;
import com.company.classes.engines.CombustionEngine;
import com.company.classes.interfaces.swimming;
import com.company.classes.type.Flying;
import java.math.BigDecimal;

// dziedziczenie klasy - extends        // implementacja interfejsu - implements
public class FloatPlane extends Flying implements swimming {

  int maxHeight;

  public FloatPlane(
    String name,
    BigDecimal price,
    VehicleColor color,
    int maxVelocity,
    int maxHeight,
    CombustionEngine engine
  ) {
    this.name = name;
    this.price = price;
    this.color = color;
    this.maxVelocity = maxVelocity;
    this.maxHeight = maxHeight;
    this.engine = engine;
  }

  public FloatPlane() {}
}
