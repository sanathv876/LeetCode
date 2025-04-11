import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        for(int i =0; i < nums.length; i ++){
            if(nums[i] == 0){
                if(i == 0) {
                    temp = nums[nums.length - 1 - i];
                    nums[nums.length - 1 - i] = nums[i];
                    nums[i] = temp;
                }else{
                    temp = nums[nums.length - i];
                    nums[nums.length - i] = nums[i];
                    nums[i] = temp;

                }

            }
        }
        System.out.println(Arrays.toString(nums));


    }

    public static void main(String[] args) {
        MoveZeroes z = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        z.moveZeroes(nums);
    }
}
