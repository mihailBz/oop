package lab5;

public class Letter {
    private final char symbol;
    private final String consonants = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";

    public Letter(char symbol) {
        this.symbol = symbol;
    }

    public boolean isConsonants(){
        return consonants.contains(symbol + "");
    }

    @Override
    public String toString() {
        return "" + symbol;
    }
}
