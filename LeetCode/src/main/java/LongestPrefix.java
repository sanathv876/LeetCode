import java.util.ArrayList;
public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int leastLength = strs[0].length();
        String[] start = strs[0].split("");
        String[] quickCheck = strs[strs.length -1].split("");
        if(!(start[0].equals(quickCheck[0]))){
            return ans;
        }
        ArrayList<String> complex = new ArrayList<String>();
        for(int i =0; i < strs.length; i ++){
            if(strs[i].length() < leastLength){
                leastLength = strs[i].length();
            }
        }
        for(int x = 0; x < leastLength; x++){
            complex.add(start[x]);
            //ans+=start[x];
        }
        for(int y = 1; y < strs.length; y ++){
            String[] temp = strs[y].split("");
            for(int a = 0; a < leastLength; a ++){
                if(!(complex.get(a).equals(temp[a]))){
                    complex.remove(a);
                    if(a!=0){
                        a--;
                        leastLength--;
                    }
                }
            }
        }
        for(int b = 0; b < complex.size(); b++){
            ans+=complex.get(b);
        }
        return ans;

    }

    public static void main(String[] args) {
        LongestPrefix l = new LongestPrefix();
        String[] str = {"reflower","flow","flight"};
        System.out.println(l.longestCommonPrefix(str));
    }
}
