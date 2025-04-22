import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        int start = 0;
        int end = nums.length -1;

        while(start < end){
            if(temp == end) {
                end--;
                if(nums[end+ 1] !=0){
                    break;
                }
                temp = 0;
            }
            if(nums[temp] == 0){
                int swap = nums[temp];
                nums[temp] = nums[temp+1];
                nums[temp+ 1] = swap;
                temp++;
            }else{
                temp++;
            }
        }
        //System.out.println(Arrays.toString(nums));


    }

    public static void main(String[] args) {
        MoveZeroes z = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        z.moveZeroes(nums);
    }
}
