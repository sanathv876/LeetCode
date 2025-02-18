import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStringLength {
    public int lengthOfLongestSubstring(String s) {
        String[] currentList = s.split("");
        List<String> harborList = new ArrayList<>();
        int max = 0;
        if (s.trim().equals("")) {
            return s.length() > 0 ? 1 : 0;
        }

        for (String str : currentList) {
            if (harborList.contains(str)) {
                max = java.lang.Math.max(max, harborList.size());
                String removedStr = "";
                do {
                    removedStr = harborList.remove(0);
                } while (!removedStr.equals(str));
                harborList.add(str);
            } else {
                harborList.add(str);
            }
        }
        max = max < harborList.size() ? harborList.size() : max;
        return max;
    }

    public static void main(String[] args) {
        SubStringLength s = new SubStringLength();
        System.out.println(s.lengthOfLongestSubstring("dvdf"));
        //System.out.println(s.lengthOfLongestSubstring("pwwkew"));
    }
}
