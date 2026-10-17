/*
WAP to insert an element at the certain position of the array.
Original array: [10, 20, 30, 40, 50, 60, 70]
Updated array:  [10, 20, 30, 35, 40, 50, 60, 70]
*/
class InsertElement{
    public static int[] getExtraElementInsertedArray(int[] nums, int position, int value){
        if(nums==null || position < 1 || position > nums.length+1)
            return new int[0];
        int[] newArray=new int[nums.length+1];
        int targetIndex=position-1;

        for(int i=0; i<targetIndex; i++){
            newArray[i]=nums[i];
        }
        newArray[targetIndex]=value;
        for(int i=targetIndex+1; i<newArray.length; i++){
            newArray[i]=nums[i-1];
        }
        return newArray;
    }
    public static void printArray(int[] arr){
        if(arr.length==0){
            System.out.println("Invalid Input! ");
            return;
        }   
        System.out.print("Updated Array : [");
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
        int[] arr={10, 20, 30, 40, 50, 60, 70};
        int position=4;
        int val=35;

        int[] finalResult=getExtraElementInsertedArray(arr,position,val);
        printArray(finalResult);
    }
}