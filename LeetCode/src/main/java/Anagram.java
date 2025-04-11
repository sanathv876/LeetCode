import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        String[] an1 = s.split("");
        String[] an2 = t.split("");
        Arrays.sort(an1);
        Arrays.sort(an2);

        for(int i =0; i < an1.length; i ++){
            if(!(an1[i].equals(an2[i]))){
                return false;
            }
        }


        return true;


    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        System.out.println(a.isAnagram("rat","car"));
    }
}
