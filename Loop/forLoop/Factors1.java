class Factors1{
    public static void printAndCountFactors(int n){
        int count=2;
        System.out.print(1+" "+n+" ");
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                int fact1=i, fact2=n/i;
                if(fact1 != fact2){
                    System.out.print(fact1+" "+fact2+" ");
                    count +=2;
                }else{
                    System.out.print(fact1+" ");
                    count +=1;
                }
            }
        }
        System.out.println("\nTotal Factors "+n+" are : "+count);
    }
    public static void main(String[] args){
        int num=18;
        printAndCountFactors(num);
    }
}