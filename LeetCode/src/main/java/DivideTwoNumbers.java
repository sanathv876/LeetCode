public class DivideTwoNumbers {
    public int divide(int dividend, int divisor) {

        int ans =dividend/divisor;

        if(dividend == -2147483648 && divisor == -1){
            ans = 2147483647;
        }
        return ans;

    }

    public static void main(String[] args) {
        DivideTwoNumbers d = new DivideTwoNumbers();

        System.out.println(d.divide(10,3));
    }
}
