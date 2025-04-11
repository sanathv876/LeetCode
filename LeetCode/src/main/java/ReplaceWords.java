import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        String finalString = "";
        String[] splitSentence = sentence.split(" ");
        for (String s : dictionary) {
            for (int i = 0; i < splitSentence.length; i++) {
                if(s.length() == 1){
                    if(splitSentence[i].indexOf(s) == 0){
                        splitSentence[i] = s;
                    }
                } else if (splitSentence[i].contains(s)) {
                    splitSentence[i] = s;
                }
            }
        }
        finalString = String.join(" ", splitSentence);
        return finalString;

    }


    public static void main(String[] args) {
        ReplaceWords r = new ReplaceWords();

        List<String> dictionary = new ArrayList<>();

        dictionary.add("a");
        dictionary.add("b");
        dictionary.add("c");
        String sentence = "aadsfasf absbs bbab cadsfafs";
        System.out.println(r.replaceWords(dictionary, sentence));
    }

}
