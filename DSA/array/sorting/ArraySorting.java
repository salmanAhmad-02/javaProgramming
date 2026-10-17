class ArraySorting{
    public static void main(String[] args){
        int[] a={12, 20, 8, 15, 5, 25, 16};
        int[] nums={40, 10, 30, 20, 8};

        bubbleSort(nums);
        printArray(nums);

        // insertionSort(a);
        // printArray(a);
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
    //  Selection Sort :
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
    // Insertion Sort : 
    public static void insertionSort(int[] a){
        for(int i=1; i<a.length; i++){
            int pivot=a[i];
            int j=i-1;
            while(j>=0 && a[j]>pivot){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=pivot;
        }
    }
    // Bubble Sort :
    public static void bubbleSort(int[] a){
		for(int i=0; i<a.length-1; i++){
            boolean isSorted=true;
			for(int j=0; j<a.length-1-i; j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]= a[j+1];
					a[j+1]=temp;
                    isSorted=false;
				}
			}
            if(isSorted)
                break;
		}
	}
}