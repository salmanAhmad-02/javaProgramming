class UniqueElementSum{
    public static int uniqueSumBruteForce(int[] nums) {
        // TC - O(N^2) and SC - O(1)
        int totalSum=0;
        for(int i=0; i<nums.length; i++){
            boolean same=true;
            for(int j=0; j<nums.length; j++){
                if (i == j) continue;
                if(nums[j]==nums[i]){
                    same = false;
                    break;
                }
            }
            if(same){
                totalSum += nums[i];
            }
        }
        return totalSum;
    }
    public static int trapBruteForce(int[] a){
        // TC - O(N) and SC - O(K)
        int max = a[0], min = a[0];
		for(int n:a){
			if(n>max)   max=n;
			else if(n<min)  min=n;
		}
		int[] freq = new int[max-min +1];
		for(int n:a){
			freq[n-min] += 1;
		}
		int sum=0;	
		for(int i=0; i<freq.length; i++){
			if(freq[i]==1)
				sum += min+i; 

		}
        return sum;
    }
    public static int sumOfUniqueOptimal(int[] a){
        // TC - O(N) and SC - O(1)
        // but range restricted to 1 <= a[i] <= 100
        int[] freq = new int[101];
		for (int n : a) {
            freq[n]++;
        }
		int sum=0;	
        for (int i = 1; i <= 100; i++) {
            if (freq[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,2};
        System.out.println(uniqueSumBruteForce(nums));
    }
}