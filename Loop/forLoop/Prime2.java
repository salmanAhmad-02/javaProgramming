class Prime2{
    // This is most optimal way to check Prime
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        else if(n==2)
            return true;
        else if(n%2==0)     //Because execept 2 , there is no prime number that is also even , so return false for even numbers.
            return false;
        // here loop will run only for odd numbers.
        for(int i=3; i*i<=n; i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
       int num1=41;
        
        if(isPrime(num1))
            System.out.println(num1+" is a prime number");
        else
            System.out.println(num1+" is a NOT prime number");
    }
}