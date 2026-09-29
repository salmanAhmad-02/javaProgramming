class ReverseArray2{
    public static void reverseInRange(int[] arr, int start, int end){
        if(arr==null || arr.length==0){
            return;
        }
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] nums={10,20,30,40,50,60,70,80};
        reverseInRange(nums, 2 , 5);
        SumExceptSelf.printArray(nums);
    }
}