class FibonacciSeries{
    public static int[] generateFibonacci(int n){
        int[] fibo=new int[n];
        if(n==0)    return fibo;
        fibo[0]=0;
        if(n==1)    return fibo;
        fibo[1]=1;
        for(int i=2; i<n; i++){
            fibo[i]=fibo[i-2]+fibo[i-1];
        }
        return fibo;
    }
    public static void printFibonacciSeries(int n){
        int[] series=generateFibonacci(n);
        System.out.println("Fibonacci Series of "+n+" terms are : ");
        for(int i=0; i<series.length; i++){
            System.out.print(series[i]+" ");
        }
    }
    public static void main(String[] args){
        int n=8;
        printFibonacciSeries(n);
    }
}