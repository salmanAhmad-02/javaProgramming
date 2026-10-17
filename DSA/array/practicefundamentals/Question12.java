// Print Biggest and Smallest Element of Array.
class Question12{
    public static void printMinAndMaxElement(int[] arr){
        //In case empty array
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null!");
            return;         //Exit
        }
        int minElement=arr[0], maxElement=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<minElement){
                minElement=arr[i];
            }
            else if(arr[i]>maxElement){
                maxElement=arr[i];
            }
        }
        System.out.println("Smallest Element is : "+minElement);
        System.out.println("Biggest Element is : "+maxElement);
    }
    public static void main(String[] args){
        int[] nums={4, 72, 8, 305, 1492, 9, 81, 7063, 402, 9810};
        printMinAndMaxElement(nums);
    }
}