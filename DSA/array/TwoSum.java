class TwoSum{
	public static int[] twoSum(int[] nums, int target){
		for(int i=0; i<nums.length; i++){
			for(int j=i+1; j<nums.length; j++){
				if(nums[i] + nums[j] == target )
					return new int[]{i,j};
			}
		}
		return new int[]{-1,-1};
	}
	public static void main(String[] args){
		int[] arr={4, 3, 5};
		int target=8;
		int[] indexes=twoSum(arr,target);

		if (indexes[0] != -1) {
        	int index1 = indexes[0];
        	int index2 = indexes[1];

        	System.out.println("Indices: " + index1 + ", " + index2);
        	System.out.println("Values: " + arr[index1] + ", " + arr[index2]);
    	} else {
        	System.out.println("No two numbers found that sum up to " + target);
    	}
	}
}