class ArraySorting{
    public static void main(String[] args){
        int[] a={12, 20, 8, 15, 5, 25, 16};
        selectionSort(a);

        printArray(a);
    }
    public static void printArray(int[] arr){
        if(arr==null || arr.length==0){
            System.out.println("Invalid or Empty Array!");
            return;
        }
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            if(i!=arr.length-1){
                System.out.print(arr[i]+", ");
            }
            else{
                System.out.print(arr[i]+"]");
            }
        }
        System.out.println("\n");
    }
    // This method contains the logic for Selection Sort
    public static void selectionSort(int[] a){
        for(int i=0; i<a.length; i++){
            int min=a[i], minIndex=i;
            for(int j=i+1; j<a.length; j++){
                if(a[j]<min){
                    min=a[j];
                    minIndex=j;
                }
            }
            a[minIndex]=a[i];
            a[i]=min;
        }
    }
}