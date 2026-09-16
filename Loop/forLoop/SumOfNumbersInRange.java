class SumOfNumbersInRange{
    public static int getSum(int start, int end){
        int sum=0;
        for(int i=start; i<=end; i++){
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args){
        int start=10;
        int end=23;

        int sum=getSum(start,end);
        System.out.println("Sum of numbers "+start+" to "+end+" is : "+sum);
    }
}