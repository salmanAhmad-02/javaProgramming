// WAJP to print all prime numbers available in array.
class Question16{
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
    public static void printPrimesInArray(int[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null!");
            return;
        }
        System.out.println("All Primes In Array : ");
        for(int n:arr){
            if(isPrime(n)){
                System.out.print(n+" ");
            }
        }
    }
    public static void main(String[] args){
        int[] nums={4, 7, 12, 15, 19, 21, 23, 28, 29, 30};
        printPrimesInArray(nums);
    }
}