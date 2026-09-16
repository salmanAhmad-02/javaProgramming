class Prime{
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        int count=2;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                count +=1;
            }
        }
        return count==2;
    }
    public static void main(String[] args){
       int num1=18;
       int num2=7;
        
        if(isPrime(num1))
            System.out.println(num1+" is a prime number");
        else
            System.out.println(num1+" is a NOT prime number");
        
        if(isPrime(num2))
            System.out.println(num2+" is a prime number");
        else
            System.out.println(num2+" is a NOT prime number");
    }
}