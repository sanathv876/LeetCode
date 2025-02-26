import java.util.ArrayList;
import java.util.List;

public class FindRange {
    public int[] searchRange(int[] nums, int target) {
        int[] finalList = new int[2];
        List<Integer> listNums = new ArrayList<>();
        for(int x : nums){
            listNums.add(x);

        }
        finalList[0] = listNums.indexOf(target);
        finalList[1] = listNums.lastIndexOf(target);
        return finalList;

    }
}
