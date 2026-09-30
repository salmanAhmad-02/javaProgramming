class Rotate1{
    public static void rotateArray(int[] arr, int k){
        if (arr == null || arr.length <= 1) return;
        k = k % arr.length;
        reverseArray(arr, 0, arr.length-1);
        reverseArray(arr,0, k-1);
        reverseArray(arr, k, arr.length-1);
    }
    public static void reverseArray(int[] arr,int start , int end){
        if(arr==null || arr.length==0 || start<0 || end >= arr.length){
            return;
        }
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start += 1;
            end -= 1;
        }
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7};
        rotateArray(nums,3);

        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}