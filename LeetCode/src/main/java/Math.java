import java.util.ArrayList;
public class Math {
    public int subtractProductAndSum(int n) {
        String m = Integer.toString(n);

        int product = 1;
        int sum =0;

        for(int i =0; i < m.length(); i ++){
            int temp = Integer.parseInt(m.substring(i,i+1));
            product *= temp;
            sum += temp;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        Math m = new Math();
        System.out.println(m.subtractProductAndSum(234));
    }
}
