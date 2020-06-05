package lab6;

public class Spell extends Ammunition{

    private int effect;
    private String type;

    public Spell(int price, int weight, int effect, String type) {
        super(price, weight);
        this.effect = effect;
        this.type = type;
    }
}
