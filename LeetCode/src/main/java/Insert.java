public class Insert {
    public int searchInsert(int[] nums, int target) {
        int yes=0;
        for (int i =0; i < nums.length; i ++){
            if(nums[i] == target){
                 yes = i;
            }else{
                if(nums[i] < target){
                    yes = i+1;
                }
            }
        }
        return yes;

    }

    public static void main(String[] args) {
        int [] num = {1,3,5,6};
        Insert i = new Insert();
        int ans = i.searchInsert(num,2);
        System.out.println(ans);
    }
}
