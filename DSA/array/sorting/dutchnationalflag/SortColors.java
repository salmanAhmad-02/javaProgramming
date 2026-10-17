class SortColors{
    public static void arrangeColors(int[] nums) {
        int start=0, mid=0, end=nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
                swap(nums, start++, mid++);
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums, mid, end--);
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] nums={2, 0, 2, 1, 1, 0};
        arrangeColors(nums);

        for(int n:nums){
            System.out.print(n+" ");
        }

    }
}