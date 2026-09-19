class StrongNumbersInRange{
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
    public static void printAndCountStrongNumbers(int start, int end){
        int count=0;
        for(int i=start; i<=end; i++){
            if(isStrong(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nTotal Strong Numbers are : "+count);
    }
    public static void main(String[] args){
        int st=1;
        int en=100000;
        printAndCountStrongNumbers(st,en);
    }
}