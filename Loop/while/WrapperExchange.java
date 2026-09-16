// Wrapper Exchange Problem:
/* Problem Statement: Rohan has X rupees. He wants to buy chocolates from a shop. Each chocolate costs Y rupees.
*  Every chocolate comes with one wrapper.
*  The shopkeeper has a special offer: Exchange Z wrappers for 1 free chocolate.
*  Every free chocolate also gives one wrapper, which can be used in future exchanges.
*  Find the maximum number of chocolates Rohan can eat.
*/

//e.g. -- i/p: money = 15 cost = 1 wrappersNeeded = 3  o/p: 22

class WrapperExchange{
    public static int countChocolates(int budget, int price, int exchanges){
        int total = budget/price;
        int empty = total;
        while(empty>=exchanges){
            total +=empty/exchanges;
            empty =empty/exchanges + empty % exchanges;
        }
        return total;
    }
    public static void main(String[] args){
        System.out.println("Total Chocolates Eaten By Rohan is : "+countChocolates(15,1,3));
        System.out.println("Total Chocolates Eaten By John is : "+countChocolates(40,3,5));
        System.out.println("Total Chocolates Eaten By Blake is : "+countChocolates(30,2,3));
        System.out.println("Total Chocolates Eaten By Miller is : "+countChocolates(9,1,3));
    }
}