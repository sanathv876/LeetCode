import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int x :nums){
            arrList.add(x);
        }
        for(int i = 1; i <= nums.length; i ++){
            if(arrList.contains(i)){
                continue;
            }else{
                ans.add(i);

            }
        }
        return ans;
    }


    public static void main(String[] args) {
        FindMissingNumbers f = new FindMissingNumbers();
        int[] nums = {1,1};

        System.out.println(f.findDisappearedNumbers(nums));
    }
}
