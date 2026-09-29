class ReverseArray1{
    public static void reverse(int[] arr){
        int start=0, end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start +=1;
            end -=1;
        }
    }
    public static void main(String[] args){
        int[] nums={10, 20, 30, 40, 50, 60, 70};
        reverse(nums);
        SumExceptSelf.printArray(nums);
    }
}