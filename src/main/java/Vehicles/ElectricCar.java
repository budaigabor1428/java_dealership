package Vehicles;

import Components.Engine;
import Components.Tires;

public class ElectricCar extends Vehicle {

    public ElectricCar(int price, String color, Engine engine, Tires tires) {
        super(price, color, engine, tires);
    }
}
