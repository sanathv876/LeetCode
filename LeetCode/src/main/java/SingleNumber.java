import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        if(nums.length == 1){
            return nums[0];
        }
        boolean flag;
        for(int x =0; x < nums.length; x ++){
            flag= false;
            for( int y = x +1; y < nums.length; y ++){
                if(nums[y] == nums[x]){
                    flag= true;
                    x++;
                }else if(!flag && y == nums.length -1){
                    ans = nums[x];
                }
            }
        }

        return ans;

    }


    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        int[] nums = {2,2,1};
        System.out.println(s.singleNumber(nums));

    }
}
