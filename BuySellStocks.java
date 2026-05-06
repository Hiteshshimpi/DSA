public class BuySellStocks {
    public static void main(String[] args) {
        int stocks[] = {98,178,200,300,40,540,690};
        Profit(stocks);
    }

    static void Profit(int[] stocks) {
        int localMin = Integer.MAX_VALUE;
        int maxprof =0;
        int finals=0;
        for(int i = 0; i<stocks.length;i++){
            if(stocks [i] < localMin){
                localMin =stocks[i];
            }
            else if (stocks[i] - localMin > maxprof){
                maxprof = stocks[i] - localMin;
            }
        }

        System.out.println(maxprof);
        System.out.println(maxprof);
}
}
