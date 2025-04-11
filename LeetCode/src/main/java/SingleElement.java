public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;


        for(int i =0; i < nums.length; i ++){
            if(nums[i+1] != nums[i] && nums[i-1] != nums[i]){
                ans = nums[i];
                break;
            }
        }


        return ans;



    }

    public static void main(String[] args) {


        SingleElement s = new SingleElement();
        int[] nums = {1,1,2,3,3,4,4,8,8};

        System.out.println(s.singleNonDuplicate(nums));

    }
}
