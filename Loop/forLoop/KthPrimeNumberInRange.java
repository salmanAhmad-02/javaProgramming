class KthPrimeNumberInRange{
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
    public static int getKthPrimeInRange(int start, int end , int k){
        if (k <= 0) return -1;
        int count=0;
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                count +=1;
                if(count==k){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int st=100;
        int en=200;
        int k=9;
        int res=getKthPrimeInRange(st, en, k);
        if(res==-1)
            System.out.println(k+"th prime does not exist in that range!");
        else
            System.out.println(k+"th Prime Number is : "+res);
    }
}