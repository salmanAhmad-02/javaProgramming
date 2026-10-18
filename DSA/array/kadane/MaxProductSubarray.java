class MaxProductSubarray{
    public static int maxProduct(int[] nums) {
        int product=nums[0], max=nums[0], min=nums[0];
        for(int i=1; i<nums.length; i++){
            int temp = max;
            max = Math.max(nums[i], Math.max(nums[i]*max, nums[i]*min));
            min = Math.min(nums[i], Math.min(nums[i]*temp, nums[i]*min));
            product = Math.max(max, product);
        }
        return product;
    }
    public static void main(String[] args){
        int[] nums={2,3,-2,4};
        System.out.println("Maximum Product : "+maxProduct(nums));
    }
}