import java.util.ArrayList;
import java.util.List;

public class SelfDividing{
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ans = new ArrayList<>();
        for(int x = left; x <=right; x++){
            if(isSelfDividing(x)){
                ans.add(x);
            }
        }

        return ans;

    }

    public boolean isSelfDividing(int num){
        boolean isSelf = true;
        String numStr = Integer.toString(num);
        for(int i = 0; i < numStr.length(); i++){
            int temp = Integer.parseInt(numStr.substring(i,i+1));
            if(temp == 0){
                return false;
            }
            else if(num%temp != 0){
                isSelf = false;
            }
        }

        return  isSelf;

    }


    public static void main(String[] args) {
        SelfDividing s = new SelfDividing();
        System.out.println(s.selfDividingNumbers(47,85));
    }
}
