package lab5;

public class Main {
    public static void main(String[] args) {

//        Letter letter1 = new Letter('a');
//        Letter letter2 = new Letter('b');
//        Letter[] letters = {letter1, letter2};
//        Word word = new Word(letters);
//        System.out.println(word);

        Text text = new Text("В этом, втором издании книги, наряду с попыткой устранить опечат\n" +
                "ки первого 1) , сделаны отдельные изменения изложения (в основном это\n" +
                "касается вариантов доказательств отдельных теорем) и добавлены некоторые\n" +
                "новые задачи, как правило, неформального характера. В преди\n" +
                "словии к первому изданию этого курса анализа уже дана его общая\n" +
                "характеристика, указаны основные принципы и направленность\n" +
                "изложения. Здесь я хотел бы сделать несколько практических замечаний,\n" +
                "связанных с использованием книги в учебном процессе.");

        System.out.println("Старый текст:\n" + text);
        String textString = text.toString();


        String wordsToDeleteString = text.wordDeleter().toString();
        System.out.println("\nСлова, которые нужно удалить:\n" + wordsToDeleteString);
        for (String wordString :
                wordsToDeleteString.split("\n")) {

            textString = textString.replaceAll(wordString, "");
        }
        System.out.println("Новый текст:\n" +textString);



    }
}
