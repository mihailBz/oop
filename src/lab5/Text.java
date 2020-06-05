package lab5;

public class Text {
    private final Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public Text(String textString) {
        String[] sentencesStrings = textString.split("(?<=[?!.]) ");
        sentences = new Sentence[sentencesStrings.length];
        for (int i = 0; i < sentencesStrings.length; i++) {
            sentences[i] = new Sentence(sentencesStrings[i]);
        }
    }



    public StringBuilder wordDeleter() {
        StringBuilder wordsToDelete = new StringBuilder();
                for (Sentence sentence :
                sentences) {
                    wordsToDelete.append(sentence.wordDeleter());
                }
                return wordsToDelete;

//        Sentence[] newSentences = new Sentence[sentences.length];
//        int counter = 0;
//        for (Sentence sentence :
//                sentences) {
//            SentenceElement[] sentenceElements = sentence.wordDeleter();
//            sentence = new Sentence(sentenceElements);
//            newSentences[counter] = sentence;
//            counter +=1;
//        }
//        return new Text(newSentences);
//
    }



    @Override
    public String toString() {
        StringBuilder textString = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            textString.append(sentences[i].toString() + (i != sentences.length - 1 ? " " : ""));
        }
        return textString.toString();
    }
}
