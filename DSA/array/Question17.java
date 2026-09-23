// WAJP to count all prime numbers available in array.
class Question17{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }     
        }
        return true;
    }
    public static int countPrimesInArray(int[] arr){
        int count=0;
        if( arr == null || arr.length == 0){
            System.out.println("Array is empty or null! ");
            return 0;
        }
        for(int n:arr){
            if(isPrime(n)){
                count +=1;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums={4, 7, 12, 15, 19, 21, 23, 28, 29, 30};
        int totalPrimes=countPrimesInArray(nums);
        System.out.println("Total Primes in array is : "+totalPrimes);
    }
}