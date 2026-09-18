class StrongNumber{
    public static int getFactorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact *=i;
        }
        return fact;
    }
    public static boolean isStrong(int n){
        int sum=0, num=n;
        while(n>0){
            sum +=getFactorial(n%10);
            n /=10;
        }
        return sum==num;
    }
    public static void main(String[] args){
        int n=145;
        if(isStrong(n))
            System.out.println(n+" is a strong number");
        else
            System.out.println(n+" is not a strong number");
    }
}