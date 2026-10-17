// WAJP to store n prime numbers in array.
class Question20{
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
    public static int[] nPrimeNumbers(int n){
        if(n<=0) {
            return new int[0];
        }
        int index=0;
        int[] arr=new int[n];
        for(int i=2; index<n ;i++){
            if(isPrime(i)){
                arr[index]=i;
                index++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int n=10;
        int[] resPrimes=nPrimeNumbers(n);
        System.out.println(n+" Primes Are : ");
        for(int a:resPrimes){
            System.out.print(a+" ");
        }
        System.out.println("\n");
    }
}