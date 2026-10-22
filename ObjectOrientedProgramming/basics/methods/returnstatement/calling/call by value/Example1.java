class Example1{
    public static void printSum(int a, int b){
        System.out.println("Sum of "+a+" and "+b+" is : "+(a+b));
    }
    public static void main(String[] args){
        // Examples of call by value 
        printSum(12,23);
        int a = 45;
        int b = 34;
        printSum(a,b);

        int n1=98, n2=2;
        printSum(n1, n2);

        // Also can say that primitive data are passed through value.
    }
}