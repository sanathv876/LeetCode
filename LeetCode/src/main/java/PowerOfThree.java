import java.lang.Math;
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        double answer = Math.log(n) / Math.log(3.0);
        int a = (int)( answer + 0.5);
        return Math.pow(3, a) == n;
    }


    public static void main(String[] args) {
        PowerOfThree p = new PowerOfThree();
        System.out.println(p.isPowerOfThree(45));
    }
}
