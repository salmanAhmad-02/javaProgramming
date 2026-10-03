class MostFrequetElement{
    public static void printMostFrequentElement(int[] a){
        // Guard against null or empty array
        if (a == null || a.length == 0) {
            System.out.println("Array is empty.");
        return;
        }
        int max=a[0], min=a[0];
        for(int n:a){
            if(n>max)
                max=n;
            else if(n<min)
                min=n;
        }
        int[] freq=new int[max-min+1];
        for(int n:a){
            freq[n-min] += 1;
        }
        int frequencyCount=0, element=0;
        for(int i=0; i<freq.length; i++){
            if(freq[i]>frequencyCount){
                frequencyCount = freq[i];
                element = min + i;
            }
        }
        System.out.println("Element " + element + " appears " + frequencyCount + " times.");
    }
    public static void main(String[] args){
        int[] nums={15, 11, 15, 12, 12, 10, 15, 10};
        printMostFrequentElement(nums);
    }
}