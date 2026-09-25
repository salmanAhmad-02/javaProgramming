class StockProfitMaximizer{
    public static int calculateMaxProfit(int[] prices){
        int buy=prices[0], profit=0;
        for(int n:prices){
            if(n<buy){
                buy=n;
            }
            else if((n-buy)>profit){
                profit=n-buy;
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] prices={17,8,10,2,12,1,7};
        int maxProfit=calculateMaxProfit(prices);
        System.out.println("Maximum Possible Profit is : "+maxProfit);
    }
}