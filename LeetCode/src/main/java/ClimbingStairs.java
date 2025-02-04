import java.util.ArrayList;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int oneStep = 1;
        int twoStep = 2;
        int ans = 0;
        if(n == 1){
            ans = oneStep;
        }else if(n== 2){
            ans = twoStep;
        }
        int totalSteps = 0;
        for(int i =3; i <= n; i ++){
            ans = oneStep + twoStep;
            oneStep = twoStep;
            twoStep = ans;

        }




        return ans;


    }

    public static void main(String[] args) {
        ClimbingStairs c = new ClimbingStairs();
        System.out.println(c.climbStairs(10));



    }
}
