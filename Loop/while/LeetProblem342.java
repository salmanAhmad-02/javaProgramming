class LeetProblem342{
    public static boolean isPowerOfFour(int n){
        if(n==1)
            return true;
        else if(n<=0 || n%2 !=0)
            return false;
        while(n%4==0){
            n /=4;
        }
        return n==1;
    }
    public static void main(String[] args){
        int num1=16;
        int num2=32;

        if(isPowerOfFour(num1))
            System.out.println(num1+" is in power of : 4");
        else
            System.out.println(num1+" is NOT in power of : 4");
        
        if(isPowerOfFour(num2))
            System.out.println(num2+" is in power of : 4");
        else
            System.out.println(num2+" is NOT in power of : 4");
    }
}