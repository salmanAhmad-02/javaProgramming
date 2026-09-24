// WAP to find second distict biggest element of the array.
// import java.lang.Integer;    //Provide by .lang pack
class SecondDistictBiggest{
    public static int findSecondMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;

        for(int n:arr){
            if(n>max){
                secMax=max;
                max=n;
            }
            else if(n>secMax && n!=max){
                secMax=n;
            }
        }
        return secMax;
    }
    public static void main(String[] args){
        int[] nums={80, 80, 43, 50, 38, 63, 58, 80};
        int secLargest=findSecondMax(nums);
        System.out.println(secLargest);
    }
}