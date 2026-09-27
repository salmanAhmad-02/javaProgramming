/*
WAP to remove an element from the certain position of the array.
Original array: [10, 20, 30, 40, 50, 60, 70]
Updated array:  [10, 20, 40, 50, 60, 70]
*/
class RemoveElement{
    public static int[] getRemovedElementArray(int[] nums, int position){
        if(nums==null || nums.length==0)       
            return new int[0];
        if(position < 1 || position > nums.length)
            return new int[0];
        int targetIndex=position-1;
        int[] newArray=new int[nums.length-1];
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(i!=targetIndex){
                newArray[index]=nums[i];
                index++;
            }
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
        int[] nums={10, 20, 30, 40, 50, 60, 70};
        int position=3;

        int[] finalResult=getRemovedElementArray(nums,position);
        printArray(finalResult);
    }
}