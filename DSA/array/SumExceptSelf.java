/*
WAP for below requirements:
Sum except itself:
Original array:  [2, 5, 4, 3, 6]
Resultant array: [18, 15, 16, 17, 14]
*/
class SumExceptSelf{
    public static int[] getSum(int[] nums){
        if(nums==null || nums.length==0)
            return new int[0];
        int[] newArray=new int[nums.length];
        int totalSum=0;
        for(int n:nums){
            totalSum += n;
        }
        for(int i=0; i<nums.length; i++){
            newArray[i]=totalSum-nums[i];
        }
        return newArray;
    }
    //Array Printing Method In String Form
    public static void printArray(int[] arr){
        if(arr.length==0){
            System.out.println("Invalid Input! ");
            return;
        }   
        System.out.print("Output Array : [");
        for(int i=0; i<arr.length; i++){
            if(i != arr.length-1){
                System.out.print(arr[i]+", ");
            }
            else{
                System.out.print(arr[i]+"]");
            }
        }
        System.out.println("\n");
    }
    public static void main(String[] args){
        int[] arr={2, 5, 4, 3, 6};
        int[] result=getSum(arr);
        printArray(result);
    }
}
