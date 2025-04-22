import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProgramAnything {
    public int numberOfMatches(int n) {
        int sum = 0;
        int matches = 0;
        int diff = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                diff = n / 2;
                matches = diff;
            } else {
                matches = (n - 1) / 2;
                diff = ((n - 1) / 2) + 1;
            }
            sum += matches;
            n = diff;
        }
        return sum;

    }

    public static void main(String[] args) {
        ProgramAnything p = new ProgramAnything();
        System.out.println(p.numberOfMatches(7));
    }
}
