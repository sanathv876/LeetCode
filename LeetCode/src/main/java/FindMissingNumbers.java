import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        String number = String.join(" ",Arrays.toString(nums));
        List<Integer> missingNums = new ArrayList<>();
        int i = 1;
        while(i <= nums.length){
            if(!number.contains(Integer.toString(i))){
                missingNums.add(i);
            }
            i++;
        }
        return missingNums;

    }


    public static void main(String[] args) {
        FindMissingNumbers f = new FindMissingNumbers();
        int[] nums = {1,1};

        System.out.println(f.findDisappearedNumbers(nums));
    }
}
