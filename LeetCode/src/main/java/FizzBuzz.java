import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzz = new ArrayList<>();

        for(int i = 1; i <= n; i ++){
            if(i%3 ==0 && i%5==0){
                fizzBuzz.add("FizzBuzz");
            }else if(i%3 ==0){
                fizzBuzz.add("Fizz");
            }else if(i%5==0){
                fizzBuzz.add("Buzz");
            }else{
                fizzBuzz.add(Integer.toString(i));
            }


        }
        return fizzBuzz;


    }

    public static void main(String[] args) {
        FizzBuzz f= new FizzBuzz();

        System.out.println(f.fizzBuzz(5));
    }
}
