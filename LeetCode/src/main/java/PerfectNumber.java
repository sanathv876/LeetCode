public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int i =1;
        while(i<num){
            if(num%i == 0){
                sum+=i;
            }
            i++;
        }

        return num == sum;


    }


    public static void main(String[] args) {
        PerfectNumber p = new PerfectNumber();

        System.out.println(p.checkPerfectNumber(7));
    }
}
