public class DigitAdd {
    public int addDigits(int num) {


        String strNum = Integer.toString(num);
        int sum =0;

        for(int i =0; i < strNum.length(); i ++){
            int temp = Integer.parseInt(strNum.substring(i,i+1));
            sum += temp;
            if(Integer.toString(sum).length() > 1){
                 sum = addDigits(sum);
            }

        }
        return sum;




    }

    public static void main(String[] args) {
        DigitAdd d = new DigitAdd();
        System.out.println(d.addDigits(0));

    }
}
