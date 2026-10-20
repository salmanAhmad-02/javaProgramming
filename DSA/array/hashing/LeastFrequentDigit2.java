class LeastFrequentDigit2{
    public static void main(String[] args){
        int n=1553322;
        int result=getLeastFrequent(n);     //op :  1
        System.out.print("Least Frequent Digit Is : "+result);
    }
    public static int getLeastFrequent(int n){
        if(n<0){
            n *=-1;
        }
        int org=n;
        int[] freq = new int[10];
        while(n>0){
            int digit = n%10;
            freq[digit]++;
            n/=10;
        }
        int least = -1;
        int minFreq = Integer.MAX_VALUE;
        for(int i=0; i<freq.length; i++){
            if(freq[i] > 0 && freq[i]<minFreq){
                minFreq = freq[i];
                least = i;
            }
        }
        return least;
    }
}