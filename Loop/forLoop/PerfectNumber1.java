class PerfectNumber1{
    public static boolean isPerfect(int n){
        int sum=1;
        if(n<=1)
            return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                int fact1=i, fact2=n/i;
                if(fact1 != fact2){
                    sum +=(fact1 + fact2);
                }else{
                    sum +=fact1;
                }
            }
        }
        return sum==n;
    }
    public static void main(String[] args){
        int num=24;
        if(isPerfect(num))
            System.out.println(num+" is perfect number");
        else
            System.out.println(num+" is NOT a perfect number");
    }
}