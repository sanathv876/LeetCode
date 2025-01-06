import java.lang.StringBuilder;
public class Palidrome {
    public boolean isPalindrome(int x) {
        String oG= String.valueOf(x);
        StringBuilder r = new StringBuilder(oG);
        //String reverse = r.reverse().toString();

        //return oG.equals(reverse);
        return String.valueOf(x).equals(r.reverse().toString());

    }
}
