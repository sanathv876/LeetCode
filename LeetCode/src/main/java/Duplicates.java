import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public int removeDuplicates(int[] nums) {
        //System.out.println(Arrays.toString(nums));
        //Arrays.sort(nums);
        int x = 0;
        int[] temp = new int[nums.length];
        temp[x] = nums[0];
        x++;
        for(int i =1; i <nums.length; i ++){
            if(nums[i- 1] == nums[i]){
                continue;
            }else{
                temp[x] = nums[i];
                x++;
            }
        }
        if (x >= 0) System.arraycopy(temp, 0, nums, 0, x);
        //System.out.println(Arrays.toString(nums));
        return x;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2}; // Input array
        int[] expectedNums = {1,2}; // The expected answer with correct length
        Duplicates d = new Duplicates();

        int k = d.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }



    }
}
