class BinarySearch{
    //  For sorted array,  in ascending order.
    public static int binarySearch(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return -1;
        }
        int st=0, end = arr.length - 1;
        while(st<= end){
            int mid = (st + end)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                st = mid + 1; 
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {2, 8, 25, 27, 33, 46, 57, 61};
        int target = 57; 
        int index = binarySearch(nums, target);
        if(index==-1){
            System.out.println("Target Not Present!"); 
        }
        else{
            System.out.println("Target Index is : "+index); 
        }
    }
}