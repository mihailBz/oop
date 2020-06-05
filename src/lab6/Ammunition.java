package lab6;

public class Ammunition {
    private int price;
    private int weight;

    public Ammunition(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Ammunition{" +
                " class= " + getClass().getSimpleName() +
                " price=" + price +
                ", weight= " + weight +
                '}';
    }
}
