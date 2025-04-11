import java.lang.Math;
import java.util.Arrays;

public class ProgramTwo {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        boolean flag = true;
        int output= 0;
        for (int k : arr1) {
            for (int i : arr2) {
                if (Math.abs(k - i) <= d) {
                    flag = false;
                }
            }
            if (flag ==true) {
                output++;

            }
        }

        return output;

    }

    public static void main(String[] args) {
        ProgramTwo p = new ProgramTwo();
        int[]arr1 = {1,4,2,3};
        int[]arr2 = {-4,-3,6,10,20,30};
        System.out.println(p.findTheDistanceValue(arr1,arr2,3));
    }


}
