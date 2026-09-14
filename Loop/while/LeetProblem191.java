class LeetProblem191{
    // Modulo approach - TC will be constant, but here loop will iterate more time ..
    //Not going to use this method , it was for understanding purpose 
    public static int hammingWeight(int n) {
        int res=0;
        while(n>0){
            res +=n%2;
            n = n >> 1;
        }
        return res;
    }
    // This approach is more efficient in term of iterating the loop,
    public static int getHammingWeight(int n) {
        int res=0;
        while(n>0){
            n = n & (n-1);
            res +=1;
        }
        return res;
    }
    public static int hammingWeightByBaseTwoDevide(int n){
        int res=0;
        while(n>0){
            res += n % 2;
            n /=2;      // shifts bits right by 1
        }
        return res;
    }
    public static void main(String[] args){
        int n1=11;
        int n2=128;

        int result1=getHammingWeight(n1);
        int result2=getHammingWeight(n2);

        System.out.println("Number of 1 bits present in number "+n1+" is : "+result1);
        System.out.println("Number of 1 bits present in number "+n2+" is : "+result2);

    }
}