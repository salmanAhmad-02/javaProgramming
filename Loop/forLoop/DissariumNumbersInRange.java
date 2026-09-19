class DissariumNumbersInRange{
    public static int getDigitCount(int n){
        int count=0;
        while(n>0){
            count++;
            n /=10;
        }
        return count;
    }
    public static int getPower(int base, int exponent){
        int pow=1;
        for(int i=1; i<=exponent; i++){
            pow *= base;
        }
        return pow;
    }
    public static boolean isDissarium(int n){
        int count=getDigitCount(n);
        int sum=0, num=n;
        while(n>0){
            sum +=getPower(n%10, count);
            count--;
            n /=10;
        }
        return sum==num;
    }
    public static void printAndCountDissariumNumbers(int start,int end){
        int count=0;
        for(int i=start; i<=end; i++){
            if(isDissarium(i)){
                System.out.print(i+" ");
                count +=1;
            }
        }
        System.out.println("\nTotal Dissarium Numbers From "+start+" To "+end+" Are : "+count);
    }
    public static void main(String[] args){
        int st=1;
        int en=1000;
        printAndCountDissariumNumbers(st,en);
    }
}