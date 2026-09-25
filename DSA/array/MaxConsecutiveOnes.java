class MaxConsecutiveOnes{
    public static int findMaxConsecutiveOnes(int[] nums){
        int res=0; int temp=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                temp++;
            }
            else{
                if(temp>res){
                    res = temp;
                }
                temp=0;
            }
        }
        if(res<temp)
            res=temp;
        return res;
    }
    public static void main(String[] args){
        int[] arr={0,1,1,1,0,0,1,1,1,1};
        int result=findMaxConsecutiveOnes(arr);
        System.out.println("Maximum Consective Ones Are : "+result);
    }
}