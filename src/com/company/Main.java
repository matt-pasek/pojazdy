package com.company;

import static com.company.VehicleColor.*;

import com.company.classes.engines.BicycleDrive;
import com.company.classes.engines.CombustionEngine;
import com.company.classes.engines.ElectricEngine;
import com.company.classes.interfaces.driving;
import com.company.classes.interfaces.flying;
import com.company.classes.interfaces.swimming;
import com.company.classes.interfaces.work;
import com.company.classes.parent.Engine;
import com.company.classes.parent.Entity;
import com.company.classes.parent.Vehicle;
import com.company.classes.type.Driving;
import com.company.classes.type.Flying;
import com.company.classes.vehicles.*;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    // engines

    // combustion engine
    CombustionEngine combustionEngine1 = new CombustionEngine(2, 50);
    CombustionEngine combustionEngine2 = new CombustionEngine(3, 60);

    // electric engine
    ElectricEngine electricEngine1 = new ElectricEngine(50);
    ElectricEngine electricEngine2 = new ElectricEngine(60);

    // bicycle engine
    BicycleDrive bicycleDrive1 = new BicycleDrive();
    BicycleDrive bicycleDrive2 = new BicycleDrive();

    // vehicles

    // bicycles
    Bicycle bicycle1 = new Bicycle(
      "Rower górski",
      BigDecimal.valueOf(750),
      RED,
      50,
      bicycleDrive1
    );
    Bicycle bicycle2 = new Bicycle(
      "Rower miejski",
      BigDecimal.valueOf(500),
      WHITE,
      25,
      bicycleDrive2
    );

    // bulldozers
    Bulldozer bulldozer1 = new Bulldozer(
      "Big Caterpillar",
      BigDecimal.valueOf(200000),
      YELLOW,
      30,
      combustionEngine1
    );
    Bulldozer bulldozer2 = new Bulldozer(
      "Komatsu D575 Super Dozer",
      BigDecimal.valueOf(100000),
      BLACK,
      15,
      combustionEngine2
    );

    // buses
    Bus bus1 = new Bus(
      "Autobus ZTM",
      BigDecimal.valueOf(89999.99),
      BLUE,
      150,
      combustionEngine1
    );
    Bus bus2 = new Bus(
      "PolskiBus",
      BigDecimal.valueOf(49999.99),
      WHITE,
      75,
      combustionEngine2
    );

    // car amphibians
    CarAmfibia carAmfibia1 = new CarAmfibia(
      "Tinger Compact 500 wszędołaz",
      BigDecimal.valueOf(22700),
      RED,
      200,
      combustionEngine1
    );
    CarAmfibia carAmfibia2 = new CarAmfibia(
      "VOLVO BV 202 BANDVAGN",
      BigDecimal.valueOf(45000),
      SILVER,
      100,
      combustionEngine2
    );

    // cats
    Cat cat1 = new Cat("Maja", BigDecimal.valueOf(1000.99));
    Cat cat2 = new Cat("Puszek", BigDecimal.valueOf(800.98));

    // delivery vans
    DeliveryVan deliveryVan1 = new DeliveryVan(
      "UPS",
      BigDecimal.valueOf(50000),
      BLACK,
      140,
      combustionEngine1
    );
    DeliveryVan deliveryVan2 = new DeliveryVan(
      "DPD",
      BigDecimal.valueOf(25000),
      BLACK,
      80,
      combustionEngine2
    );

    // float-planes
    FloatPlane floatPlane1 = new FloatPlane(
      "Samolot Pasażerski LOT",
      BigDecimal.valueOf(150000),
      GREEN,
      2000,
      5000,
      combustionEngine1
    );
    FloatPlane floatPlane2 = new FloatPlane(
      "Samolot Towarowy",
      BigDecimal.valueOf(75000),
      YELLOW,
      1800,
      5500,
      combustionEngine2
    );

    // helicopters
    Helicopter helicopter1 = new Helicopter(
      "Burzowiec Pospolity",
      BigDecimal.valueOf(200000),
      RED,
      170,
      6000,
      combustionEngine1
    );
    Helicopter helicopter2 = new Helicopter(
      "Helikopter Bojowy MK2",
      BigDecimal.valueOf(100000),
      YELLOW,
      140,
      3100,
      combustionEngine2
    );

    // jet fighters
    JetFighter jetFighter1 = new JetFighter(
      "Myśliwiec",
      BigDecimal.valueOf(2000000),
      BLACK,
      600,
      22000,
      combustionEngine1
    );
    JetFighter jetFighter2 = new JetFighter(
      "Myśliwiec Mały",
      BigDecimal.valueOf(1500000),
      YELLOW,
      450,
      12000,
      combustionEngine2
    );

    // motorbikes
    Motobike motobike1 = new Motobike(
      "Ziemniak",
      BigDecimal.valueOf(13000),
      SILVER,
      175,
      combustionEngine1
    );
    Motobike motobike2 = new Motobike(
      "Parówka",
      BigDecimal.valueOf(10322),
      GREEN,
      200,
      combustionEngine2
    );

    // sedans
    Sedan sedan1 = new Sedan(
      "Pomidor Malinowy",
      BigDecimal.valueOf(40000),
      YELLOW,
      170,
      combustionEngine1
    );
    Sedan sedan2 = new Sedan(
      "Ogórek Małosolny",
      BigDecimal.valueOf(27000),
      BLACK,
      135,
      combustionEngine2
    );

    // trams
    Tram tram1 = new Tram(
      "Tramwaj ZTM",
      BigDecimal.valueOf(350000),
      GREEN,
      60,
      electricEngine1
    );
    Tram tram2 = new Tram(
      "Tramwaj Podmiejski",
      BigDecimal.valueOf(250000),
      SILVER,
      75,
      electricEngine2
    );

    // arrays
    // tab1 - zawiera wszystkie obiekty (Zadanie 2)
    Entity[] tab1 = {
      bicycle1,
      bicycle2,
      bulldozer1,
      bulldozer2,
      bus1,
      bus2,
      carAmfibia1,
      carAmfibia2,
      cat1,
      cat2,
      deliveryVan1,
      deliveryVan2,
      floatPlane1,
      floatPlane2,
      helicopter1,
      helicopter2,
      jetFighter1,
      jetFighter2,
      motobike1,
      motobike2,
      sedan1,
      sedan2,
      tram1,
      tram2,
    };

    ArrayList<Entity> tempEntity = new ArrayList<>();
    ArrayList<Vehicle> tempVehicle = new ArrayList<>();

    // tab2 - zawiera wszystkie obiekty z silnikiem
    //ArrayList <Entity> temp2 = new ArrayList();
    for (Entity entity : tab1) {
      if (Vehicle.class.isAssignableFrom(entity.getClass())) {
        tempEntity.add(entity);
      }
    }
    Vehicle[] tab2 = new Vehicle[tempEntity.size()];

    for (int i = 0; i < tempEntity.size(); i++) {
      tab2[i] = (Vehicle) tempEntity.get(i);
    }
    tempEntity.clear();

    // tab3 - zawiera wszystkie jeżdżące pojazd
    for (Entity entity : tab1) {
      if (driving.class.isAssignableFrom(entity.getClass())) {
        tempEntity.add(entity);
      }
    }
    Driving[] tab3 = new Driving[tempEntity.size()];

    for (int i = 0; i < tempEntity.size(); i++) {
      tab3[i] = (Driving) tempEntity.get(i);
    }
    tempEntity.clear();

    //tab4 - zawiera wszystkie latające pojazdy
    for (Entity entity : tab1) {
      if (flying.class.isAssignableFrom(entity.getClass())) {
        tempEntity.add(entity);
      }
    }
    Flying[] tab4 = new Flying[tempEntity.size()];

    for (int i = 0; i < tempEntity.size(); i++) {
      tab4[i] = (Flying) tempEntity.get(i);
    }
    tempEntity.clear();

    //tab5 - zawiera wszystkie pływające pojazdy
    for (Entity entity : tab1) {
      if (swimming.class.isAssignableFrom(entity.getClass())) {
        tempEntity.add(entity);
      }
    }
    swimming[] tab5 = new swimming[tempEntity.size()];

    for (int i = 0; i < tempEntity.size(); i++) {
      tab5[i] = (swimming) tempEntity.get(i);
    }
    tempEntity.clear();

    //tab6 - zawiera wszystkie pojazdy ze zbiornikiem paliwa
    for (Vehicle value : tab2) {
      if (value.engine instanceof CombustionEngine) {
        tempVehicle.add(value);
      }
    }
    Entity[] tab6 = new Entity[tempVehicle.size()];

    for (int i = 0; i < tempVehicle.size(); i++) {
      tab6[i] = tempVehicle.get(i);
    }
    tempVehicle.clear();

    //tab7 - [bulldozer1, bulldozer2]
    for (Entity entity : tab1) {
      if (work.class.isAssignableFrom(entity.getClass())) {
        tempEntity.add(entity);
      }
    }
    Bulldozer[] tab7 = new Bulldozer[tempEntity.size()];

    for (int i = 0; i < tempEntity.size(); i++) {
      tab7[i] = (Bulldozer) tempEntity.get(i);
    }
    tempEntity.clear();

    //a. - “kup(String cena)”, “wypiszNazweKlasyRodzica()”, “wypiszNazwePojazdu()”, “kup(String cena)”, “sprzedaj(String cena)” na obiektach z “tab1”
    for (Entity entity : tab1) {
      entity.printName();
      entity.buy(entity.price);
      entity.printParentName();
      entity.buy(entity.price);
      entity.sell(entity.price);
      System.out.println("\n");
    }

    //b. - “kup(String cena)”, “uruchomSilnik()” na obiektach z “tab2”
    for (Vehicle value : tab2) {
      value.buy(value.price);
      Engine engine = value.engine;
      engine.startEngine();
      System.out.println("\n");
    }

    //c. - “kup(String cena)”, “jedź(int prędkość)” na obiektach z “tab3”
    for (Driving driving : tab3) {
      driving.buy(driving.price);
      driving.go(150);
      System.out.println("\n");
    }

    //while
    int i = 0;
    //d. - “kup(String cena)”, “leć(int prędkość)”, “ląduj()” na obiektach z “tab4"
    while (i < tab4.length) {
      tab4[i].buy(tab4[i].price);
      tab4[i].fly(1500, 150);
      tab4[i].land();
      System.out.println("\n");
      i++;
    }

    //e. - “kup(String cena)”, “płyń (int prędkość)” na obiektach z “tab5"
    i = 0;
    while (i < tab5.length) {
      Vehicle vehicle = (Vehicle) tab5[i];
      vehicle.buy(vehicle.price);
      tab5[i].swim(150);
      System.out.println("\n");
      i++;
    }

    //f. - “kup(String cena)”, “zatankuj(int ilośćPaliwa)” na obiektach z “tab6"
    i = 0;
    while (i < tab6.length) {
      tab6[i].buy(tab6[i].price);
      Engine engine = tab2[i].engine;
      engine.refuel(100);
      System.out.println("\n");
      i++;
    }

    //g. - “kup(String cena)”, “robotyZiemne()” na obiektach z “tab7”
    i = 0;
    while (i < tab7.length) {
      tab7[i].buy(tab7[i].price);
      tab7[i].work();
      System.out.println("\n");
      i++;
    }
  }
}
