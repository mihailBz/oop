package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence extends SentenceElement {

    private static final String punctuationSymbols = ",.!?;";
    private SentenceElement[] sentenceElements;
    private final int requiredLength = 5;

    public Sentence(SentenceElement[] sentenceElements) {
        this.sentenceElements = sentenceElements;
    }

    public Sentence(String sentenceString) {
        String[] sentenceElementsStrings = sentenceString.split("(?=[" + punctuationSymbols + "])|\\s");
        sentenceElements = new SentenceElement[sentenceElementsStrings.length];
        String sentenceElementString;
        for (int i = 0; i < sentenceElementsStrings.length; i++) {
            sentenceElementString = sentenceElementsStrings[i];
            sentenceElements[i] = punctuationSymbols.contains(sentenceElementString)
                    ? new Punctuation(sentenceElementString)
                    : new Word(sentenceElementString);

        }
    }

    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        for (int i = 0; i < sentenceElements.length; i++) {
            sentenceString.append(
                    (i != 0 && sentenceElements[i] instanceof Word ? " " : "") +
                            sentenceElements[i].toString()
            );
        }
        return sentenceString.toString();
    }

    public void wordDeleter(){
        ArrayList<SentenceElement> newSentenceElementsArrayList = new ArrayList<>();
        for (SentenceElement sentenceElement :
        sentenceElements){
            if ( sentenceElement instanceof Word) {
                Word word = (Word) sentenceElement;
                if (word.length() == requiredLength && word.StartsWithConsonant()){}
                else {
                    newSentenceElementsArrayList.add(word);
                }
            } else {
                newSentenceElementsArrayList.add(sentenceElement);
            }
        }
        SentenceElement[] newSentenceElements = new SentenceElement[newSentenceElementsArrayList.size()];
        this.sentenceElements = newSentenceElementsArrayList.toArray(newSentenceElements);
    }
}
