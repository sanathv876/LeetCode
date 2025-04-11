import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n+1))/ 2;
        int actualSum = 0;
        for(int x : nums){
            actualSum+= x;
        }
        //int actualSum = Arrays.stream(nums).sum();
        return expectedSum - actualSum;
    }


    public static void main(String[] args) {
        MissingNumber m = new MissingNumber();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(m.missingNumber(nums));
    }
}
