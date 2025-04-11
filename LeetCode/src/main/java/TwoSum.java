import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] original = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int[] tSum = new int[2];
        int i =0;
        int j = nums.length - 1;
        int sum;
        while(i !=j){
            sum = nums[i] + nums[j];
            if(sum == target){
                break;
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }
        int firstNum = nums[i];
        int secondNum = nums[j];
        int count = 0;
        boolean firstFlag = false;
        boolean secondFlag = false;
        for(int x = 0; x < original.length; x++){
            if(original[x] == firstNum && !firstFlag){
                tSum[0] =x;
                count++;
                firstFlag = true;
            }else if(original [x] == secondNum && !secondFlag){
                tSum[1] = x;
                count++;
                secondFlag = true;
            }
            if(count == 2){
                break;
            }
        }
        return tSum;

    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] num = new int[4];
        num[0] = 2;
        num[1] = 5;
        num[2] = 5;
        num[3] = 11;
        //num[4] = -5;
        int[] sum = twoSum.twoSum(num, 10);
        System.out.print(sum[0] + " ");
        System.out.println(sum[1]);
    }
}
