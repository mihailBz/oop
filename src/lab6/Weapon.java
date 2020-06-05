package lab6;

public class Weapon extends Ammunition {
    private int distance;
    private int strength;

    public Weapon(int price, int weight, int distance, int strength) {
        super(price, weight);
        this.distance = distance;
        this.strength = strength;
    }
}
