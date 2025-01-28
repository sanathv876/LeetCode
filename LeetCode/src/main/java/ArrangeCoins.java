public class ArrangeCoins {
    public int arrangeCoins(int n) {
        int completeRows = 0;
        int rowLength = 1;
        for(int i = n; i > 0; i --){
            int coinCount = 0;
            coinCount++;
            if(coinCount == rowLength){
                completeRows++;
                rowLength+=1;
            }

        }
        return completeRows;

    }

    public static void main(String[] args) {
        ArrangeCoins a = new ArrangeCoins();
        System.out.println(a.arrangeCoins(8));

    }
}
