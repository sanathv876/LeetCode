import java.util.Arrays;
import java.lang.Math;

public class Plusone {
    public int[] plusOne(int[] digits){
        if(digits.length >=10){
            int nineCount =0;
            for(int a :digits){
                if(a ==9){
                    nineCount++;
                }
            }
            if(nineCount == digits.length){
                int[] newNums = new int[digits.length+1];
                newNums[0] =1;
                for(int b = 1; b < newNums.length; b ++){
                    newNums[b] =0;
                }
                return newNums;

            }
            else if(digits[digits.length-1] ==9){
                digits[digits.length-1]  =0;
                digits[digits.length -2]+=1;
                return digits;
            }else {
                digits[digits.length - 1] += 1;
                return digits;
            }
        }
        double regen = Math.pow(10, digits.length-1);
        int sum =0;
        for (int digit : digits) {
            sum += digit*regen;
            if(regen==0){
                break;
            }
            regen/=10;

        }
        sum+=1;

        String whole= Integer.toString(sum);
        String[] listnum = whole.split("");
        int[] newdigits = new int[listnum.length];
        for( int i = 0; i < newdigits.length; i ++){
            newdigits[i] = Integer.parseInt(listnum[i]);
        }

        return newdigits;

        /*

        for (int digit : digits) {
            whole += digit;
        }
        String[] listnum = whole.split("");
        int[] newdigits = new int[listnum.length];
        for( int i = 0; i < newdigits.length; i ++){
            newdigits[i] = Integer.parseInt(listnum[i]);
        }
        return newdigits;
        */
    }

    public static void main(String[] args) {
        Plusone a = new Plusone();
        int[] nums = {5,6,2,0,0,4,6,2,4,9};
        System.out.println(Arrays.toString(a.plusOne(nums)));
    }
}
