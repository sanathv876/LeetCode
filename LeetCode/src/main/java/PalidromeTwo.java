public class PalidromeTwo {
    public boolean isPalindrome(int x) {
        String oG= String.valueOf(x);
        int i=0;
        int j= oG.length()-1;
        while(true){
            if(i >=j){
                return true;
            }else if(oG.charAt(i) != oG.charAt(j)){
                return false;
            }
            i+=1;
            j-=1;

        }

    }

    public static void main(String[] args) {
        PalidromeTwo p = new PalidromeTwo();
        System.out.println(p.isPalindrome(121));
    }
}
