public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] tSum = new int[2];
        for (int x = 0; x < nums.length; x++) {
            for (int y = x + 1; y < nums.length; y++) {
                if (nums[x] + nums[y] == target) {
                    tSum[0] = x;
                    tSum[1] = y;
                    break;

                }

            }
        }
        return tSum;

    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] num = new int[4];
        num[0] = 2;
        num[1] = 7;
        num[2] = 11;
        num[3] = 15;
        int[] sum = twoSum.twoSum(num, 17);
        System.out.println(sum[0]);
        System.out.println(sum[1]);
    }
}
