class ProductExceptSelf{
    public static int[] getProductExceptSelf(int[] nums){
        if(nums==null || nums.length==0)
            return new int[0];
        int zeroCount=0, productWithoutZero=1;
        for(int n:nums){
            if(n==0){
                zeroCount++;
            }
            else{
                productWithoutZero *= n;
            }
        }
        int[] result=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(zeroCount>1){
                result[i]=0;
            }
            else if(zeroCount==1){
                if(nums[i]==0)
                    result[i]=productWithoutZero;
                else
                    result[i]=0;
            }
            else{
                result[i]=productWithoutZero/nums[i];
            }
        }
        return result;
    }
    public static void main(String[]args){
        int[] arr={-1,1,0,-3,3};
        int[] finalResult=getProductExceptSelf(arr);

        // Reusing printArray() from SumExceptSelf class!
        SumExceptSelf.printArray(finalResult);
    }
}