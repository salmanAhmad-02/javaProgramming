/* WAJP to shift all 0’s to left and all 1’s to the right(Without Sorting).
    i/p: 	[0, 1, 1, 0, 0, 1, 0, 0]
    o/p: 	[0, 0, 0, 0, 0, 1, 1, 1]
*/
class ShiftZero{
    public static void moveZeroInLeft(int[] arr){
        if(arr==null || arr.length==0)
            return;
        int i=0;
        for(int j=0; j<arr.length; j++){
            if(arr[j]==0){
                swap(arr,i,j);
                i++;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] nums={0, 1, 1, 0, 0, 1, 0, 0};
        moveZeroInLeft(nums);
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}