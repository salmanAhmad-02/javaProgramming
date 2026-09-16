class Factors{
    public static void printAndCountFactors(int n){
        System.out.print("1, " + n + " ");
        int count=2;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                System.out.print(i+", ");
                count +=1;
            }
        }
        System.out.println("\nTotal Factors of "+n+" are : "+count);
    }
    public static void main(String[] args){
        int num=18;
        printAndCountFactors(num);
    }
}