import java.lang.Math;
public class Square {
    public boolean isPowerOfTwo(int n) {
        double num = (double) n;
        double answer = Math.log10(n) / Math.log10(2);
        if((int) answer == answer){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Square s = new Square();
        System.out.println(s.isPowerOfTwo(16));
    }


}
