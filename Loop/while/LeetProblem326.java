class LeetProblem326{
    public static boolean isPowerOfThree(int n){
        if(n<=0 || n%2==0){
            return false;
        }
        while(n%3==0){
            n /=3;
        }
        return n==1;
    }
    public static void main(String[] args){
        int num1=1;     //3^0=1
        int num2=27;    //3^3=27
        int num3=45;    //Not in power of 3

        if(isPowerOfThree(num1)){
            System.out.println(num1+" is in power of three");
        }
        else{
            System.out.println(num1+" is NOT in power of three");   
        }

        if(isPowerOfThree(num2)){
            System.out.println(num2+" is in power of three");
        }
        else{
            System.out.println(num2+" is NOT in power of three");   
        }

        if(isPowerOfThree(num3)){
            System.out.println(num3+" is in power of three");
        }
        else{
            System.out.println(num3+" is NOT in power of three");   
        }
    }
}