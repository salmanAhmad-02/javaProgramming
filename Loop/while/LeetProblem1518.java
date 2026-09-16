class LeetProblem1518{
    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles=0; int emptyBottles=0;
        while(numBottles>0){
            emptyBottles +=numBottles;
            totalBottles +=numBottles;

            numBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;
        }
        return totalBottles;
    }
    public static void main(String[] args){
        System.out.println("Total Bottles Used : "+numWaterBottles(9,3));
        System.out.println("Total Bottles Used : "+numWaterBottles(15,4));
    }
}