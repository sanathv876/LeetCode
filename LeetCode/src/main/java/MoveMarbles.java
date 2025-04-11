import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveMarbles {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        Arrays.sort(nums);
        List<Integer> marbles = new ArrayList<>();
        List<Integer> move = new ArrayList<>();
        for(int s : moveTo) {
            move.add(s);
        }
        for(int x :nums){
            marbles.add(x);
        }
        for(int i =0; i < moveFrom.length; i ++) {
            for (int j = 0; j < marbles.size(); j++) {
                if (moveFrom[i] == marbles.get(j)) {
                    marbles.remove(j);
                    marbles.add(j, moveTo[i]);
                }
            }
        }


        if(marbles.containsAll(move)){
            for(int b =0; b < marbles.size()-1; b++){
                marbles.remove(b);
                b--;
            }
        }
        Collections.sort(marbles);


        return marbles;


    }


    public static void main(String[] args) {
        MoveMarbles m = new MoveMarbles();

        int[] nums = {1,6,7,8};
        int[] move = {1,7,2};
        int[] place = {2,9,5};


        System.out.println(m.relocateMarbles(nums,move,place));
    }
}
