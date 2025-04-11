import java.util.Arrays;

public class RemoveElements {
    public int removeElement(int[] nums, int val){
        int count = 0;
        int[] dummyArr = new int[nums.length];
        int x = 0;
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i =0; i < nums.length; i ++){
            if(nums[i] == val){
                continue;
            }else{
                dummyArr[x] = nums[i];
                x++;
                count++;
            }
        }
        if (count >= 0) System.arraycopy(dummyArr, 0, nums, 0, count);
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {2};
        System.out.println(Arrays.toString(nums));
        RemoveElements r = new RemoveElements();
        System.out.println(r.removeElement(nums,3));
        System.out.println(Arrays.toString(nums));
    }

}
