import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindingUniqueLetters {
    public Map<String, Integer> findNumUnique(String sentence){
        String[] words = sentence.split(" ");
        //return process(words);
        return enhancedProcess(words);
    }

    Map<String, Integer> enhancedProcess(String[] words) {
        Map<String,Integer> letterMap = new HashMap<>();

        Arrays.stream(words).forEach(word -> {
            String tempWord = word.toLowerCase();
            Integer count = letterMap.getOrDefault(tempWord, 0) + 1;
            letterMap.put(tempWord, count);
        });
        return letterMap;
    }

    Map<String, Integer> process(String[] words) {
        Map<String,Integer> letterMap = new HashMap<>();
        for(String word : words) {
            String tempWord = word.toLowerCase();
            Integer count = letterMap.getOrDefault(tempWord, 0) + 1;
            letterMap.put(tempWord, count);
        }
        return letterMap;
    }

    public static void main(String[] args) {
        FindingUniqueLetters f = new FindingUniqueLetters();

        System.out.println(f.findNumUnique("This is a book of aa Book"));
    }
}
