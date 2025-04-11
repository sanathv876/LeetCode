public class JewelsStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i =0; i < stones.length(); i ++){
            if(stones.substring(i,jewels.length()).equals(jewels)){
                count++;
                i+=jewels.length();

            }


        }

        return  count;



    }

    public static void main(String[] args) {
        JewelsStones j = new JewelsStones();

        System.out.println(j.numJewelsInStones("aA","aAAbbbb"));
    }
}
