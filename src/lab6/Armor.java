package lab6;

public class Armor extends Ammunition{
    private String material;
    private int defence;


    public Armor(int price, int weight, String material, int defence) {
        super(price, weight);
        this.material = material;
        this.defence = defence;
    }
}
