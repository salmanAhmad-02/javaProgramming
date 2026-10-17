class Rotate2{
    public static void leftRotate(int[] arr, int k){
        if (arr == null || arr.length <= 1) return;         
        k = k % arr.length;
        reverseArray(arr, 0, k-1);                 //reverse first k elements
        reverseArray(arr, k, arr.length-1);       //reverse all after k elements
        reverseArray(arr, 0, arr.length-1);      //again reverse complete array.
    }
    /*
    this method also can be use as same for left rotation...
    public static leftRotate(int[] arr, int k){
        if (arr == null || arr.length <= 1) return;
        k = k % arr.length;

        //Step-1: Reverse Whole Array first
        reverseArray(arr, 0, arr.length-1);         //[7, 6, 5, 4, 3, 2, 1]

        //Step-2: Reverse from 0 to before k 
        reverseArray(arr, 0, arr.length-1-k);       //[3, 4, 5, 6, 7, 2, 1]

        //Step-3: Raverse those k elements
        reverseArray(arr, arr.length-k, arr.length-1);  //[3, 4, 5, 6, 7, 1, 2]  <- final Outcome

    } 
    */
    public static void reverseArray(int[] arr,int start , int end){
        if(arr==null || arr.length==0 || start<0 || end >= arr.length){
            return;
        }
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }
    public static void main(String[] args){
        int[] nums={1, 2, 3, 4, 5, 6, 7};
        leftRotate(nums,2);

        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}