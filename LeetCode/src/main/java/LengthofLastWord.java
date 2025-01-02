public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length-1].length();




    }

    public static void main(String[] args) {
        LengthofLastWord a =  new LengthofLastWord();
        System.out.println(a.lengthOfLastWord("Hello World"));
    }
}
