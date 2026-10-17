class RemoveDuplicate{
    public static int removeTwin(int[] nums){
        int k=1;
        int i=1;
        while(i<nums.length){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
    public static void main(String[] args){
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int a=removeTwin(nums);
    
        for(int i=0; i<a; i++){
            System.out.print(nums[i]+" ");
        }
        
    }
}