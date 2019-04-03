package Vehicles;

import Components.Engine;
import Components.Tires;

public class Car extends Vehicle {

    public Car(int price, String color, Engine engine, Tires tires) {
        super(price, color, engine, tires);
    }
}
