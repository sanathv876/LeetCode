public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();


    }

    public static void main(String[] args) {
        LengthOfLastWord a = new LengthOfLastWord();
        System.out.println(a.lengthOfLastWord("Hello World"));
    }
}
