package lab6;

public class Bow extends Weapon {
    private int arrowsQuantity;

    public Bow(int price, int weight, int distance, int strength, int arrowsQuantity) {
        super(price, weight, distance, strength);
        this.arrowsQuantity = arrowsQuantity;
    }
}
