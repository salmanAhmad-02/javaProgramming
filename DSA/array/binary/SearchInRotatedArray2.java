/*
81. Search in Rotated Sorted Array II

    There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

    Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) 
    such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
    For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

    Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

    You must decrease the overall operation steps as much as possible.

Example 1:

    Input: nums = [2,5,6,0,0,1,2], target = 0
    Output: true

Example 2:

    Input: nums = [2,5,6,0,0,1,2], target = 3
    Output: false
    
Constraints:

    1 <= nums.length <= 5000
    -104 <= nums[i] <= 104
    nums is guaranteed to be rotated at some pivot.
    -104 <= target <= 104 
*/
public  class SearchInRotatedArray2{
    public static boolean search(int[] nums, int target){
        // Handle the array containing only one element
        if(nums.length == 1 && nums[0] == target){
            return true;
        }
        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            // Target found
            if(nums[mid] == target ){
                return true;
            }
            // Handle duplicates when start, mid and end elements are equal
            // Shrink the search space because we cannot identify the sorted half
            if(nums[start] == nums[mid] &&  nums[mid] == nums[end]){
                start += 1;
                end -= 1;
                continue; 
            }
             // Check if the left half is sorted
            else if(nums[start] <= nums[mid]){
                // Check if target lies within the sorted left half
                if(nums[start] <= target && target < nums[mid]){
                   end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            // Otherwise, the right half is sorted
            else{
                // Check if target lies within the sorted right half
                if(nums[end]>= target && target > nums[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2}; int target = 3;

        if(search(nums, target)){
            System.out.println(target + " is present in the array.");
        }
        else{
            System.out.println(target + " is not present in the array.");
        }
    }
}