class NonRepeatingElement{
    public static int getFirstNonRepeated(int[] a){
        int max=a[0], min=a[0];
        for(int n:a){
            if(n>max)
                max = n;
            else if(n<min)
                min = n;
        }
        int[] freq = new int[max-min+1];
        for(int n:a){
            freq[n-min] += 1;
        }
        for(int i=0; i<a.length; i++){
            if(freq[a[i]-min]==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={15, 10, 15, 12, 12, 10, 15, 11};
        int index=getFirstNonRepeated(arr);

        if(index !=-1){
            System.out.println("\nFirst unique element is at index " + index + " (value : " + arr[index] + ")");
        }
        else{
            System.out.println("No unique element found.");
        }
    }
}