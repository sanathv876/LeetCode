public class Fib {
    public int fib(int n) {
        int num1 = 0;
        int num2 = 1;
        int num3 =0;
        if(n == 1){
            return num2;
        }
        for(int i =1; i < n; i++){
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
        }

        return num3;

    }

    public static void main(String[] args) {
        Fib f = new Fib();
        System.out.println(f.fib(4));
    }
}
