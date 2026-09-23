// WAJP to check whether a given array is in sorted order or not. i/p: [2, 7, 7, 8, 9] o/p: Array is sorted.
class Question15{
    public static boolean isAscending(int[] arr){
        if (arr == null || arr.length == 0) {
            return false;           //for empty array
        }
        for(int i=1; i<arr.length; i++){
            if(!(arr[i]>=arr[i-1])){
                return false;
            }
        }
        return true;
    }
    public static boolean isDescending(int[] arr){
        if (arr == null || arr.length == 0) {
            return false;           //for empty array
        }
        for(int i=1; i<arr.length; i++){
            if(!(arr[i]<=arr[i-1])){
                return false;
            }
        }
        return true;
    }
    public static boolean isSorted(int[] arr){
        return isAscending(arr) || isDescending(arr);
    }
    public static void main(String[] args){
        int[] nums={2, 7, 7, 8, 9};
        if(isSorted(nums))
            System.out.println("Array is sorted");
        else
            System.out.println("Array is NOT sorted");
    }

}