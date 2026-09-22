//  Access all even index elements from array
class Question1{
    public static void main(String[] args){
        int[] nums={12,23,54,676,23,45,87,90};
        System.out.println("All Even index elements are : ");
        for(int i=0; i<nums.length; i+=2){
            System.out.print(nums[i]+" ");
        }
    }
}