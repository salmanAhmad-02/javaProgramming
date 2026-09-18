class PrimeNumbersInRange{
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
    public static void printAndCountPrime(int start, int end){
        int count=0;
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count +=1;
            }
        }
         System.out.println("\nTotal Prime Numbers In Range "+start+" To "+end+" are : "+count);
    }
    public static void main(String[] args){
        int st=1;
        int end=100;

        printAndCountPrime(st,end);   
    }
}