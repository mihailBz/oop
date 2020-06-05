package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Knight {
    private Ammunition[] ammunitions;
    private String name;

    public Knight(Ammunition[] ammunitions, String name) {
        this.ammunitions = ammunitions;
        this.name = name;
    }

    public int getTotalPrice(){
        int sum = 0;
        for (Ammunition ammunition :
                ammunitions) {
            sum += ammunition.getPrice();
        }
        return sum;
    }
    public void sortByWeight(){
        Arrays.sort(ammunitions, Comparator.comparing(Ammunition::getWeight));
        System.out.println(Arrays.toString(ammunitions));
    }

    public void getAmmunitionInRange(int bottom, int top){
        ArrayList<Ammunition> ammunitionArrayList;
        ammunitionArrayList = new ArrayList<>();
        for (Ammunition ammunition :
                ammunitions) {
            if (ammunition.getPrice() >= bottom && ammunition.getPrice() <= top){
                ammunitionArrayList.add(ammunition);
            }
        }
        System.out.println(ammunitionArrayList);
    }
}
