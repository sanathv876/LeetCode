public class AddStrings {
    public String addStrings(String num1, String num2) {
        double n1= Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        double sum = n1+n2;
        return Double.toString(sum);




    }


    public static void main(String[] args) {
        AddStrings s = new AddStrings();
        System.out.println(s.addStrings("6913259244","71103343"));


    }

}
