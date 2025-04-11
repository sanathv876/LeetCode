import java.util.Arrays;

public class SubstringRemoval {
    public String removeOccurrences(String s, String part) {

        String[] test = s.split(part);

        System.out.println(Arrays.toString(test));



        return "hello";

    }

    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";

        SubstringRemoval sub = new SubstringRemoval();


        sub.removeOccurrences(s,part);
    }
}
