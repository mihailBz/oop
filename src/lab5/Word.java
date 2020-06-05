package lab5;
import java.util.Arrays;

public class Word extends SentenceElement{
    private final Letter[] letters;

    public Word(Letter[] letters) {

        this.letters = letters;
    }

    public Word(String wordString) {
        char[] lettersChars = wordString.toCharArray();
        letters = new Letter[lettersChars.length];
        for (int i = 0; i < lettersChars.length; i++) {
            letters[i] = new Letter(lettersChars[i]);
        }
    }

    public boolean StartsWithConsonant(){
        return letters[0].isConsonants();
    }

    @Override
    public String toString() {
        StringBuilder stringWord = new StringBuilder();
        for (Letter letter :
                letters) {
            stringWord.append(letter.toString());
        }
        return stringWord.toString();
    }

    public int length() {
        return letters.length;
    }
}
