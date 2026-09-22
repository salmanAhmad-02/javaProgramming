//  count all even elements from array.
class Question3{
    public static int countEvenElements(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums={12,23,54,676,23,45,87,90};
        int count=countEvenElements(nums);
        System.out.println("Even Numbers in given array are : "+count);
    }
}