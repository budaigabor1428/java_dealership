package Vehicles;

import Components.Engine;
import Components.Tires;
public abstract class Vehicle {

    private int price;
    private String colors;
    private Engine engine;
    private Tires tires;

    public Vehicle(int price, String colors, Engine engine, Tires tires) {
        this.price = price;
        this.colors = colors;
        this.engine = engine;
        this.tires = tires;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }






}
