class TwoSumOnSortedArray{
    public static int[] twoSum(int[] numbers, int target){
        int start=0, end=numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                return new int[]{start+1, end+1};
            }
            else if(numbers[start]+numbers[end]<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args){
        int[] numbers = {2,7,11,15}; 
        int target = 9;
        int[] indices=twoSum(numbers,target);

        if(indices[0]==-1){
            System.out.println("Target Not found!");
        }
        else{
            System.out.print("Indexes Are : [ ");
            for(int n:indices){
                System.out.print(n+" ");
            }
            System.out.println("]\n");
        }
    }
}