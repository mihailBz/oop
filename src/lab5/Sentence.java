package lab5;

import java.util.ArrayList;
import java.util.Arrays;

public class Sentence extends SentenceElement {

    private static final String punctuationSymbols = ",.!?;";
    private SentenceElement[] sentenceElements;

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

//    public Word[] wordDeleter(){
//        ArrayList<Word> wordsToDeleteList;
//        wordsToDeleteList = new ArrayList<Word>();
//        Word [] wordsToDelete = {};
//        for (SentenceElement sentenceElement:
//             sentenceElements) {
//            if(sentenceElement instanceof Word){
//                Word word = (Word) sentenceElement;
//                if (word.length() == 5 && word.StartsWithConsonant()){
//                    wordsToDeleteList.add(word);
//                }
//            }
//            wordsToDelete = wordsToDeleteList.toArray(new Word[wordsToDeleteList.size()]);
//        }
//        return wordsToDelete;
//    }
//}

    public StringBuilder wordDeleter() {
        StringBuilder wordsToDelete = new StringBuilder();
//        SentenceElement[] newSentenceElements = new SentenceElement[sentenceElements.length - wordsToDelete.toString().split("\n").length];
//        int counter = 0;

        for (SentenceElement sentenceElement :
                sentenceElements) {
            if (sentenceElement instanceof Word) {
                Word word = (Word) sentenceElement;
                if (word.length() == 5 && word.StartsWithConsonant()) {
                    wordsToDelete.append(word.toString() + "\n");
                }
            }
        }
        return wordsToDelete;
//        for (SentenceElement sentenceElement :
//                sentenceElements) {
//            if (sentenceElement instanceof Word) {
//                Word word = (Word) sentenceElement;
//                if (wordsToDelete.toString().contains(word.toString())) {
//                    continue;
//                } else {
//                    newSentenceElements[counter] = word;
//                    counter += 1;
//                }
//            }
//        }
//        return newSentenceElements;
    }
}



//    public SentenceElement[] wordsInSentenceDeleter(StringBuilder wordsToDelete) {
//        SentenceElement[] newSentenceElements = new SentenceElement[sentenceElements.length - wordsToDelete.toString().split("\n").length];
//        int counter = 0;
//
//        for (SentenceElement sentenceElement :
//                sentenceElements) {
//            if (sentenceElement instanceof Word) {
//                Word word = (Word) sentenceElement;
//                if (wordsToDelete.toString().contains(word.toString())) {
//                    continue;
//                } else {
//                    newSentenceElements[counter] = word;
//                    counter += 1;
//                }
//            }
//
//        }
//        return newSentenceElements;
//    }
