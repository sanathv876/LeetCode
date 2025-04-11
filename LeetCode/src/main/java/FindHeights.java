import java.util.Arrays;

public class FindHeights {
    public int heightChecker(int[] heights) {
        int[] expected  = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int odd = 0;
        for(int i = 0; i < heights.length; i ++){
            if(heights[i] != expected[i]){
                odd++;
            }
        }

        return odd;



    }

    public static void main(String[] args) {
        FindHeights f = new FindHeights();

        int[] heights = {1,1,4,2,1,3};

        System.out.println(f.heightChecker(heights));


    }

}
