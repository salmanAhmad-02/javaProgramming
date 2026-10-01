// Return the smallest index i such that the sum of the digits of nums[i] is equal to i.
// Constraints: 1 <= nums.length <= 100     0 <= nums[i] <= 1000

class SmallestIndexWithDigitSum{
    public static int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int number=nums[i];
            int digitSum=0;
            while(number>0){
                digitSum += number%10;
                number /= 10;
            }
            if(digitSum==i){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums={1,10,12};
        System.out.println("Smalles Index is : "+smallestIndex(nums));
    }
}