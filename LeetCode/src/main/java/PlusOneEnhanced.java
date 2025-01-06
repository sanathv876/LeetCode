import java.lang.Math;
import java.util.Arrays;

public class PlusOneEnhanced {
    public int[] plusOne(int[] digits){
        if(digits[digits.length - 1] != 9){
            digits[digits.length - 1] +=1;
            return digits;
        }
        for(int i = digits.length-1; i >0; i --){
            if(digits[i] >= 9){
                digits[i] = 0;
                digits[i-1] +=1;
                if(digits[i-1] == 9){
                    return digits;
                }
            }else{
                return digits;
            }
        }
        if(digits[0] >=10|| digits.length == 1){
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            return newDigits;
        }else{
            return digits;
        }

    }

    public static void main(String[] args) {
        PlusOneEnhanced a = new PlusOneEnhanced();
        int[] nums = {9,8,9};
        System.out.println(Arrays.toString(a.plusOne(nums)));
    }
}
