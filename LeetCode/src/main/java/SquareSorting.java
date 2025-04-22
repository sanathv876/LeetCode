import java.lang.Math;
import java.util.Arrays;

public class SquareSorting {
    public int[] sortedSquares(int[] nums) {

        if(nums.length == 1){
            nums[0] = nums[0] * nums[0];
            return nums;
        }

        for(int i =0; i <nums.length; i ++){
            double temp = nums[i];
            nums[i] = (int)(Math.pow(temp, 2.0));
        }
        Arrays.sort(nums);

        //int x = 0;
/*
        while(nums[0] >= nums[1]){
            while(nums[x] >= nums[x+1]){
                int temp = nums[x];
                nums[x] = nums[x+1];
                nums[x+1] = temp;
                x++;
                if(x == nums.length - 1){
                    break;
                }

            }
            x=0;

        }

 */



        return nums;


    }


    public static void main(String[] args) {
        SquareSorting s = new SquareSorting();
        int[] nums = {-10000,-9999,-7,-5,0,0,10000};
        int[] arr = s.sortedSquares(nums);

        System.out.println(Arrays.toString(arr));

    }
}
