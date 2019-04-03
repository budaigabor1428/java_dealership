package People;

import java.util.ArrayList;
import Vehicles.Vehicle;

public class Customer extends Person{

    private int money;
    private ArrayList<Vehicle> cars;

    public Customer (String name, int money) {
        super(name);
        this.money = money;
        cars = new ArrayList<>();
    }

    public int getMoney() {
        return this.money;
    }

    public int giveMoney(int amount) {
        if (amount <= getMoney()) {
            this.money -= amount;
            return amount;
        } else {
            return 0;
        }
    }
}
