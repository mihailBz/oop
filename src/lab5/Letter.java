package lab5;

public class Letter {
    private final char symbol;

    public Letter(char symbol) {
        this.symbol = symbol;
    }

    public boolean isConsonants(){
        String consonants = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";
        return consonants.contains(symbol + "");
    }

    @Override
    public String toString() {
        return "" + symbol;
    }
}
