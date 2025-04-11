import java.util.Arrays;

public class Monotonic {
    public boolean isMonotonic(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        boolean flag = true;
        int[] store = Arrays.copyOf(nums, nums.length);
        if(isIncreasing(nums)){
            while(i < nums.length -1 ){
                if(nums[i] <= nums[i+1]){
                    i++;
                }else{
                    return false;
                }
            }

        }else{
            while( i < nums.length -1 ){
                if(nums[i] >= nums[i+1]){
                    i++;
                }else{
                    return false;
                }

            }
        }
        return flag;
    }


    public boolean isIncreasing(int[] nums){
        return nums[0] <= nums[nums.length - 1];
    }



    public static void main(String[] args) {
        Monotonic m = new Monotonic();
        int[] nums = {11,11,9,4,3,3,3,1,-1,-1,3,3,3,5,5,5};

        System.out.println(m.isMonotonic(nums));
    }
}
