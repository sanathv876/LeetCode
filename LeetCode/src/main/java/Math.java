import java.util.ArrayList;
public class Math {
    public int subtractProductAndSum(int n) {
        String m = Integer.toString(n);
        String[] digits = m.split("");

        int product = 1;
        int sum =0;

        for(int i =0; i < digits.length; i ++){
            product*=Integer.parseInt(digits[i]);
            sum+=Integer.parseInt(digits[i]);
        }

        return product - sum;
    }

    public static void main(String[] args) {
        Math m = new Math();
        System.out.println(m.subtractProductAndSum(4421));
    }
}
