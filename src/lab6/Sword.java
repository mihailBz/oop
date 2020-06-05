package lab6;

public class Sword extends Weapon{
    private String quality;

    public Sword(int price, int weight, int distance, int strength, String quality) {
        super(price, weight, distance, strength);
        this.quality = quality;
    }
}
