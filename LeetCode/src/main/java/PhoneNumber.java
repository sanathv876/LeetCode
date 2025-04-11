import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class PhoneNumber {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, String> phone = new HashMap<>();
        List<String> combos = new ArrayList<>();
        String[] splitNum = digits.split("");
        //char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        if(digits.length() == 0){
            return combos;
        }

        phone.put(2,"abc");
        phone.put(3,"def");
        phone.put(4,"ghi");
        phone.put(5,"jkl");
        phone.put(6,"mno");
        phone.put(7,"pqrs");
        phone.put(8,"tuv");
        phone.put(9,"wxyz");









        //System.out.println(phone);

        return combos;

    }


    public static void main(String[] args) {
        PhoneNumber p = new PhoneNumber();

        p.letterCombinations("12");
    }

}
