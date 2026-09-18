class KthPrime{
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        else if(n==2)
            return true;
        else if(n%2==0)
            return false;
        for(int i=3; i*i<=n; i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int getKthPrime(int k){
        if (k <= 0) return -1;
        int count=0;
        for(int i=1; ; i++){
            if(isPrime(i)){
                count +=1;
                if(count==k){
                    return i;
                }
            }
        }
    }
    public static void main(String[] args){
        int k=26;
        int res=getKthPrime(k);
        System.out.println(k+"th Prime Number is : "+res);
    }
}