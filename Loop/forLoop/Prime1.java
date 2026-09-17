class Prime1{
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        else if(n==2)       //if not write this block , then also code is fine, because will not go in for loop and return true.
            return true;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
       int num1=23;
        
        if(isPrime(num1))
            System.out.println(num1+" is a prime number");
        else
            System.out.println(num1+" is a NOT prime number");
    }
}