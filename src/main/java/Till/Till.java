package Till;

public class Till {

    private int amount;

    public Till(int amount) {
        this.amount = amount;
    }

    public int showAmount() {
        return this.amount;
    }

    public void addMoney(int moneyToAdd) {
        this.amount += moneyToAdd;
    }

    public int takeMoney(int moneyToRemove) {
        if (this.amount >= moneyToRemove) {
            this.amount -= moneyToRemove;
            return moneyToRemove;
        } else {
            return 0;
        }
    }
}
