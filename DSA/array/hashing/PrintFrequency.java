class PrintFrequency{
    public static void printFrequencyArray(int[] a){

		int max = a[0], min = a[0];
		for(int n:a){
			if(n>max)   max=n;
			else if(n<min)  min=n;
		}
		int[] freq = new int[max-min +1];
		for(int n:a){
			freq[n-min] += 1;
		}
			
		for(int i=0; i<freq.length; i++){
			if(freq[i]>0)
				System.out.println((i+min)+" is : "+freq[i]+" times.");

		}
	}
    public static void main(String[] args){
        int[] arr={15, 10, 15, 12, 12, 10, 15, 11};
        printFrequencyArray(arr);
    }
}