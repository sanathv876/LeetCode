import java.util.ArrayList;
import java.util.List;

public class Coins {
    public int arrangeCoins(int n) {
        int sum = 0;
        int add = 1;
        int iterateLoop = 0;
        while (sum < n){
            sum+=add;
            add++;
            System.out.println(sum);
            if(sum == n){
                return iterateLoop+1;
            }
            iterateLoop++;
        }
        return iterateLoop - 1;
    }

    public static void main(String[] args) {
        Coins coins = new Coins();
        System.out.println(coins.arrangeCoins(2147483647));
    }
}
