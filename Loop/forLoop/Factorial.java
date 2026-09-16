class Factorial{
    public static long getFactorial(int n){
        long fact=1;
        for(int i=1; i<=n; i++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args){
        int num1=5;
        long fact1=getFactorial(num1);

        int num2=4;
        long fact2=getFactorial(num2);

        System.out.println(num1+"! is : "+fact1);
        System.out.println(num2+"! is : "+fact2);
    }
}