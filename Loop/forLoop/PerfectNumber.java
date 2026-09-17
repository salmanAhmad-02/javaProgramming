class PerfectNumber{
    public static boolean isPerfect(int n){
        int sum =0;
        if(n<=5)    //There is no perfect numbers before 6, And negative cannot be perfect number
            return false;
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                sum +=i;
            }
        }
        return sum==n;
    }
    public static void main(String[] args){
        int num1=18;
        if(isPerfect(num1))
            System.out.println(num1+" is a perfect number");
        else
            System.out.println(num1+" is NOT a perfect number");
        
        int num2=28;
        if(isPerfect(num2))
            System.out.println(num2+" is a perfect number");
        else
            System.out.println(num2+" is NOT a perfect number");
    }
}