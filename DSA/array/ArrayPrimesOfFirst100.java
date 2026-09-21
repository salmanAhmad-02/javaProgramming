class ArrayPrimesOfFirst100{
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    // I have to count until the counter reach to 100
    public static int[] countAndStorePrimes(){
        int[] first100Primes=new int[100];
        int count=0;
        for(int i=1; count<100; i++){
            if(isPrime(i)){
                first100Primes[count] = i;
                count++;
            }
        }
        return first100Primes;

    }
    public static void printPrimes(){
        int[] primes=countAndStorePrimes();
        for(int i=0; i<primes.length; i++){
            System.out.print(primes[i]+" ");
        }
    }
    public static void main(String[] args){
        printPrimes();
        System.out.println("\n========================================================");
    }
}