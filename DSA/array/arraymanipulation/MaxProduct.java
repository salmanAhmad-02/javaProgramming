/*
Return the maximum value of (nums[i] - 1) * (nums[j] - 1).

Example :
Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, 
(nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
*/

class MaxProduct{
    //Constraints: 2 <= nums.length <= 500 , 1 <= nums[i] <= 10^3
    public static int getMaxProduct(int[] nums){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int n:nums){
            if(n>max1){
                max2=max1;
                max1=n;
            }
            else if(n>max2){
                max2=n;
            }
        }
        return (max1-1)*(max2-1);
    }
    public static void main(String[] args){
        int[] nums={1, 5, 4, 5};      //Expected o/p - 16
        System.out.println("Maximum Product is : "+getMaxProduct(nums));
    }
}