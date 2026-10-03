class UniqueElementSum{
    public static int sumOfUnique(int[] nums) {
        int totalSum=0;
        for(int i=0; i<nums.length; i++){
            boolean same=true;
            for(int j=0; j<nums.length; j++){
                if (i == j) continue;
                if(nums[j]==nums[i]){
                    same = false;
                    break;
                }
            }
            if(same){
                totalSum += nums[i];
            }
        }
        return totalSum;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }
}