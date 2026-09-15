class LeetProblem172{
    public static int trailingZeroes(int n){
        int count=0;
        while(n>0){
            count +=(n/5);
            n /=5;
        }
        return count;
    }
    public static void main(String[] args){
        int num1=5;
        int num2=4;
        int num3=5000;

        int zeroCount1=trailingZeroes(num1);
        int zeroCount2=trailingZeroes(num2);
        int zeroCount3=trailingZeroes(num3);

        System.out.println("Trailing Zeros in number "+num1+" is : "+zeroCount1);
        System.out.println("Trailing Zeros in number "+num2+" is : "+zeroCount2);
        System.out.println("Trailing Zeros in number "+num3+" is : "+zeroCount3);
    }
}