package lab6;

public class Main {

    public static void main(String[] args) {
        Armor lightArmor = new Armor(750, 10, "Kevlar", 500);
        Sword sword = new Sword(300, 5, 2, 100, "New");
        Bow bow = new Bow(400, 2, 50, 200, 25);
        Spell spell1 = new Spell(50, 1, 20, "Health");
        Spell spell2 = new Spell(60, 1, 30, "Rage");
        Horse horse = new Horse(2000, 500, 40, "Julius");

        Knight knight = new Knight(new Ammunition[]{lightArmor, sword, bow, spell1, spell2, horse}, "Robin");
        System.out.println("Общая стоимость: " + knight.getTotalPrice());
        System.out.println("Сортировка по весу: ");
        knight.sortByWeight();
        System.out.println("Снаряжение в диапазоне цен от 100 до 1000");
        knight.getAmmunitionInRange(100, 1000);


    }
}
