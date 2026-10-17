// Program to generate n Tribonacci Series
class TribonacciSeries{
    public static int[] generateTribonacci(int n){
        if (n<0) {
            return new int[0];      //Negative Inputs--return emty array.
        }
        int[] trib=new int[n+1];
        if(n>=0)    trib[0]=0;
        if(n>=1)    trib[1]=1;
        if(n>=2)    trib[2]=1;

        for(int i=3; i<=n; i++){
            trib[i] = trib[i-1] + trib[i-2] + trib[i-3];
        }
        return trib;
    }
    public static void printNTribonacci(int n){
        if (n < 0) {
        System.out.println("Invalid Argument: "+n+" (Index cannot be negative)");
        return;
        }
        int[] triboNumbers=generateTribonacci(n);
        System.out.println(n+" Term Tribonacci Series are : ");
        for(int x:triboNumbers){
            System.out.print(x+" ");
        }
    }
    public static int getNthTerm(int n){
        if (n < 0){
        return -1;
        }
        int[] allTerms=generateTribonacci(n);
        return allTerms[allTerms.length-1];
    }
    public static void main(String[] args){
        int terms=10;
        // printNTribonacci(terms);     //if wanted n Tribonacci Series
        int nthValue=getNthTerm(terms);
        if(nthValue<0){
            System.out.println("Invalid Argument "+terms);
        }
        else{
            System.out.println(terms+"th Term is : "+nthValue);
        }
    }
}