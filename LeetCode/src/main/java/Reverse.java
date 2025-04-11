import java.util.Arrays;

public class Reverse {
    public void reverseString(char[] s) {
        int i =0;
        int j = s.length -1;
        char temp;


        while( i < j){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(s));

    }


    public static void main(String[] args) {
        Reverse r = new Reverse();
        //char[] s = {'h','e','l','l','o'};
        char[] s = {'H','a','n','n','a','h'};
        //char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        r.reverseString(s);
    }

}
