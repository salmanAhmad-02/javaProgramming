class PerfectNumbersInRange{
    public static boolean isPerfect(int n){
        int sum=1;
        if(n<=1)
            return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                int fact1=i, fact2=n/i;
                if(fact1 != fact2){
                    sum +=(fact1 + fact2);
                }else{
                    sum +=fact1;
                }
            }
        }
        return sum==n;
    }
    public static void printAndCountPerfect(int start, int end){
        int count=0;
        for(int i=start; i<=end; i++){
            if(isPerfect(i)){
                System.out.print(i+" ");
                count +=1;
            }
        }
         System.out.println("\nTotal Perfect Numbers In Range "+start+" To "+end+" are : "+count);
    }
    public static void main(String[] args){
        int st=1;
        int end=100000;

        printAndCountPerfect(st,end);   
    }
}