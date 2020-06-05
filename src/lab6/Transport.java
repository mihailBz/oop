package lab6;

public class Transport extends Ammunition{
    private int speed;


    public Transport(int price, int weight, int speed) {
        super(price, weight);
        this.speed = speed;
    }
}
