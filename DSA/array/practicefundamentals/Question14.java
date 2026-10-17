// WAJP to check if an array is strictly increasing. i/p: [2, 3, 7, 8, 9] o/p: Array is strictly increasing.
class Question14{
    public static boolean isStrictlyIncreasing(int[] arr){
        if (arr == null || arr.length == 0) {
            return false;           //for empty array
        }
        for(int i=1; i<arr.length; i++){
            if(!(arr[i]>arr[i-1])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] nums={2, 3, 7, 8, 9};
        if(isStrictlyIncreasing(nums)){
            System.out.println("Array is strictly increasing");
        }else{
            System.out.println("Array is NOT strictly increasing");
        }
    }
}