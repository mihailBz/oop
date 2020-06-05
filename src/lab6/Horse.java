package lab6;

public class Horse extends Transport {
    private String name;

    public Horse(int price, int weight, int speed, String name) {
        super(price, weight, speed);
        this.name = name;
    }
}
