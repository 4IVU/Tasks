import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_11 {
    public static String findmaxsentence(String text) {
        if (text == null) {
            return "Текст пуст";
        }
        Pattern sentencePattern = Pattern.compile("[^.!?]+[.!?]"); //паттерн последовательности символов, не содержащие . ! или ?
        Matcher sentenceMatcher = sentencePattern.matcher(text); //итерируемся по соответсвиям

        int maxCharCount = 0;
        String longestSentence = "";

        while (sentenceMatcher.find()) {
            String sentence = sentenceMatcher.group().trim(); // убираем пробелы лишние из нашего предложения
            int charCount = sentence.length();

            if (charCount > maxCharCount) {
                maxCharCount = charCount;
                longestSentence = sentence;
            }
        }

        return longestSentence;
    }

    public static void main(String[] args) {
        String inputText = "В тёмной и кровавой долине, власть которой принадлежала безжалостной ведьме Кровавой Моране, царили ужас и страх. Её замок, пропитанный аурой зла, возвышался на вершине горы, олицетворяя мрак, который она наводила на свои владения. Морана была знаменита своей кровавой жестокостью и неумолимостью в исполнении своих чёрных желаний.\n" +
                "\n" +
                "В этом адском королевстве жил отважный охотник по имени Артур. Его сердце горело желанием освободить своих сограждан от этого кошмара. Он решительно вступил в схватку с Кровавой Мораной и её армией тьмы. Битва была жестокой, но Артур не сдавался.\n" +
                "\n" +
                "Темнота не давала отступа, а Морана, чувствуя угрозу, становилась всё более кровожадной. В заключительной стычке, когда казалось, что свет может победить тьму, Морана пролила свою кровь в жертву зловещему алтарю. Её последний акт был жутким ритуалом, который принёс ей новые могущественные силы.\n" +
                "\n" +
                "Артур, поддаваясь исчезающему свету, был охвачен вихрем тьмы, и Кровавая Морана, смеясь дьявольским смехом, поглотила его последний вздох. Её тёмные владения продолжились, а королевство погрязло в бессветлом мраке Кровавой Мораны.";

        String longestSentence = findmaxsentence(inputText);

        System.out.println("Самое длинное предложение по количеству символов:");
        System.out.println(longestSentence);
    }
}
