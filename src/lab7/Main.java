package lab7;

import lab6.Ammunition;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        Ammunition ammo1 = new Ammunition(0, 0);
        Ammunition ammo2 = new Ammunition(1, 1);
        list.add(ammo1);
        list.add(ammo2);
        list.add(new Ammunition(2, 2));
        list.add(new Ammunition(3, 3));
        System.out.println(list);

        Ammunition[] ammo = {ammo1, ammo2};

        System.out.println(list.containsAll(Arrays.asList(ammo)));

        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.get(0));

    }
}
