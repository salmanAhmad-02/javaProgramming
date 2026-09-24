class FibonacciSeries{
    public static int[] generateFibonacci(int n){
        if(n<0){
            return new int[0];
        }
        int[] fibo=new int[n];
        if(n>=0)    fibo[0]=0;
        if(n>=1)    fibo[1]=1;
        for(int i=2; i<n; i++){
            fibo[i]=fibo[i-2]+fibo[i-1];
        }
        return fibo;
    }
    public static void printNFibonacciSeries(int n){
        if(n<0){
            System.out.println("Invalid Argument: "+n+" (Index cannot be negative)");
            return;
        }
        int[] series=generateFibonacci(n);
        System.out.println("Fibonacci Series of "+n+" terms are : ");
        for(int i=0; i<series.length; i++){
            System.out.print(series[i]+" ");
        }
        System.out.println("\n");
    }
    public static int getNthFibonacciTerm(int n){
        if(n<0){
            return -1;
        }
        int[] allTerms=generateFibonacci(n);
        return allTerms[allTerms.length-1];
    }
    public static void main(String[] args){
        int terms=10;
        printNFibonacciSeries(terms);

        int nthTermValue=getNthFibonacciTerm(terms);
        if(nthTermValue<0){
            System.out.println("Invalid Argument or Negative "+terms);
        }
        else{
            System.out.println(terms+"th Term is : "+nthTermValue);
        }
    }
}