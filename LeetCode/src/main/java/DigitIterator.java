import java.lang.Math;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class DigitIterator {
    public int numDupDigitsAtMostN(int n) {
        int numCount = 0;
        for (int i = 1; i <= n; i++) {
            if (hasRepeatingDigits(i)) {
                numCount++;
            }
        }
        return numCount;

    }

    private boolean hasRepeatingDigits(int i) {
        String nStr = Integer.toString(i);
        if(nStr.length() >=2){
            String[] nArray = nStr.split("");
            Set<String> nset = Arrays.stream(nArray).collect(Collectors.toSet());
            return !(nset.size() == nArray.length);
        }

        return false;

    }

    public static void main(String[] args) {
        DigitIterator d = new DigitIterator();
        System.out.println(d.numDupDigitsAtMostN(848545));
    }

}