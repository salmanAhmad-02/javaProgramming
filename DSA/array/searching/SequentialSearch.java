class SequentialSearch{
    public static void main(String[] args){
        int[] nums = {5, 15, 10, 12, 18, 25, 6};
        int target = 12; 
        int index = linearSearch(nums, target); //expected -1
        if(index==-1){
            System.out.println("Target Not Present!"); 
        }
        else{
            System.out.println("Target Index is : "+index); 
        }
    }
    public static int linearSearch(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}