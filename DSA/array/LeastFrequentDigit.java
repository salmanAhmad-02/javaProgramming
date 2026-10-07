class LeastFrequentDigit{
    public static void main(String[] args){
        int n=1553322;
        int result=getLeastFrequent(n);     //op- 1
        System.out.print("Least Frequent Digit Is : "+result);
    }
    public static int getLeastFrequent(int num){
        if(num<0){
            num *=-1;
        }
        int org=num;
        int max=0, min=Integer.MAX_VALUE, count=0;
        while(num>0){
            int digit = num % 10;
            if(digit>max)   max=digit;
            else if(digit<min)  min=digit;
            count++;
            num /= 10;
        }
        int[] freq=new int[max-min+1];
        for(int i=0; i<count; i++){
            int digit=org % 10;
            freq[digit-min] += 1;
            org /=10;
        }
        int element=max, appearence=count;
        for(int i:freq){
            if(i<appearence && i+min<max){
                if(i!=0){
                    appearence=i;
                    element=i+min;
                }
            }
        }
        return element;
    }
}