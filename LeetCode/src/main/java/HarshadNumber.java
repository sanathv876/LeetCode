public class HarshadNumber {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num = x;
        int sum = 0;
        while(num !=0){
             sum+=num%10;
             num/=10;
        }
        int ans = 0;

        if(x % sum ==0){
             ans = sum;
        }else{
            ans = -1;
        }
        return ans;

    }
}
