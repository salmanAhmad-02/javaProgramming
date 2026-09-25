/*
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of
money. Write a function to compute the fewest number of coins   that you need to make up that amount. You must return the count of
each specific denomination used.
i/p: coins = [100, 50, 10, 5, 2, 1], amount = 371
o/p: [3, 1, 2, 0, 0, 1]
*/
class CoinChangeSolver{
    //this time this method only valid for descending sorted array..
    public static int[] calculateCoinDistribution(int[] coins, int amount){
        int[] countArr=new int[coins.length];
        for(int i=0; i<coins.length; i++){
            countArr[i]=amount/coins[i];
            amount=amount%coins[i];   
        }
        return countArr;
    }
    public static void main(String[] args){
        int[] coins={100, 50, 10, 5, 2, 1};
        int amount=371;

        int[] coinCounts=calculateCoinDistribution(coins,amount);
        System.out.println("Required coins of each are : ");
        for(int n:coinCounts){
            System.out.print(n+" ");
        }
    }
}