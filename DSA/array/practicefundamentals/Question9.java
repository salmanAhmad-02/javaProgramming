// Print sum of all even elements from array.
class Question9{
    public static int sumOfEvenInArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums={4, 72, 8, 305, 1492, 9, 81, 7063, 402, 9810};
        int res=sumOfEvenInArray(nums);
        System.out.println("Sum of all even elements from array is : "+res);
    }
}