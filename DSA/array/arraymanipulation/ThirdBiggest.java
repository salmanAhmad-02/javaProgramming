class ThirdBiggest{
    public static int getThirdMax(int[] nums) {
        long max=Long.MIN_VALUE;
        long secMax=Long.MIN_VALUE;
        long thirdMax=Long.MIN_VALUE;

        for(int n:nums){
            if(n>max){
                thirdMax=secMax;
                secMax=max;
                max=n;
            }
            else if(n>secMax && n!=max){
                thirdMax=secMax;
                secMax=n;
            }
            else if(n>thirdMax && n!=secMax && n!=max){
                thirdMax=n;
            }
        }
        if(thirdMax==Long.MIN_VALUE){
            return (int)max;
        }
        return (int)thirdMax;
    }
    public static void main(String[] args){
        int[] arr={46, 20, 44, 23, 46, 50, 50,};
        int tmax=getThirdMax(arr);
        System.out.println("Third Maximum Value is : "+tmax);
    }
}