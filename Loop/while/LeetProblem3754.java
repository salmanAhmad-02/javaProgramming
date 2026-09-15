class LeetProblem3754{
    public static long sumAndMultiply(int n) {
        long concat=0; long sum=0; long position=1;
        while(n>0){
            long digit=n%10;
            if(digit !=0){
                concat +=position * digit;
                position *=10;
                sum +=digit;
            }
            n /=10;
        }
        return (concat*sum);
    }
    public static void main(String[] args){
        int num1=10203004;
        long result1=sumAndMultiply(num1);

        int num2=1000;
        long result2=sumAndMultiply(num2);

        System.out.println("Result for "+num1+" is : "+result1);
        System.out.println("Result for "+num2+" is : "+result2);
    }
}