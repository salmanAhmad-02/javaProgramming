//  Access all even elements from array. 
class Question2{
    public static void main(String[] args){
        int[] nums={12,23,54,676,23,45,87,90};
        System.out.println("All even elements in array are : ");
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                System.out.print(nums[i]+" ");
            }
        }
    }
}