import java.util.Arrays;

public class ConcatArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int y =0;
        for(int i =0; i < ans.length; i++){
            ans[i] = nums[y];
            y++;
            if(y == nums.length){
                y= 0;
            }

        }

        return ans;

    }


    public static void main(String[] args) {
        ConcatArray c = new ConcatArray();
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(c.getConcatenation(nums)));
    }
}
