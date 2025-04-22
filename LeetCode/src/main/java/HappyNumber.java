

public class HappyNumber {
    public boolean isHappy(int n) {
        if( n == 1){
            return true;
        }else if(n == 4){
            return false;
        }
        boolean happy;
        int sum = 0;
        String numStr = Integer.toString(n);
        String[] numArr = numStr.split("");
        for (String s : numArr) {
            int num = Integer.parseInt(s);
            sum += num * num;
        }
        happy = sum == 1;

        if(!happy){
            happy = isHappy(sum);
        }

        return happy;

    }


    public static void main(String[] args) {
        HappyNumber h = new HappyNumber();

        System.out.println(h.isHappy(4));
    }
}
