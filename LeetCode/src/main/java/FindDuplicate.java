import java.util.Arrays;

public class FindDuplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        if(nums.length > 100){
            return false;
        }
        for(int i =0; i < nums.length; i ++){
            for(int j = i+1; j < nums.length ; j ++){
                if(nums[j] == nums[i]){
                    return true;
                }
            }

        }

        return ans;

    }
}
