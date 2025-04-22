import java.util.Arrays;

public class SortMergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        for(int i = m; i < nums1.length; i ++){
            nums1[i] = nums2[count];
            count++;
            if(count == nums2.length){
                break;
            }
        }

        Arrays.sort(nums1);
        //System.out.println(Arrays.toString(nums1));

    }


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[]nums2 = {2,5,6};
        SortMergeArray s = new SortMergeArray();

        s.merge(nums1,3,nums2,3);
    }
}
