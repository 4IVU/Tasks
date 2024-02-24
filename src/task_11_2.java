import java.util.Arrays;
import java.util.List;

public class task_11_2 {
    public static String findmaxsentence(String text) {
        int index_of_first_let = 0;
        int index_of_last_let = 0;
        int current_len = 0;
        int max_len = -1;
        int last_dot = 0;
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == '.') {
                if (current_len > max_len) {
                    max_len = current_len;
                    index_of_last_let = i - 1;
                    index_of_first_let = last_dot + 1;
                }


                last_dot = i;
                current_len = 0;


            } else {
                current_len += 1;
            }
        }

        String[] letters = new String[index_of_last_let-index_of_first_let+1];
        for (int j = 0, i = index_of_first_let; i <= index_of_last_let; i++, j++) {
            letters[j] = String.valueOf(text.charAt(i));
        }


        return String.join("", letters);

    }

    //}
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

