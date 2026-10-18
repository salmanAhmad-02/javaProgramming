class SearchInsertPosition{
    public static int searchInsert(int[] nums, int target) {
        int st=0, end = nums.length - 1; 
        while(st<=end){
            int mid = (st + end)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                st = mid + 1; 
            }
            else{
                end = mid - 1;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 9};
        int target = 15;

        int result = searchInsert(nums, target);

        //check that getting result is target index or suitable position
        if (result < nums.length && nums[result] == target) {
            System.out.println("Found! Target " + target + " exists at index: " + result);
        } else {
            System.out.println("Not found. Target " + target + " should be inserted at index: " + result);
        }
    }
}