import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int numCount = 1;
        int maxCount = 0;
        int maxNumber = nums[0];
        int no = nums[0];
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] != no) {
                if (numCount > maxCount) {
                    maxCount = numCount;
                    maxNumber = no;
                    no = nums[index];
                    numCount = 1;
                } else {
                    no = nums[index];
                    numCount = 1;
                }
            } else {
                numCount++;
            }

        }
        if (numCount > maxCount) {
            maxNumber = no;
        }
        return maxNumber;
    }


    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        int[] nums = {3,2,3};
        System.out.println(m.majorityElement(nums));
    }
}
