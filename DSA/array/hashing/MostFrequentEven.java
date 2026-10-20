class MostFrequentEven{
    public static int mostFrequentEven(int[] nums) {
        int min = nums[0], max = nums[0];
        for(int n:nums){
            if(n>max){
                max=n;
            }
            else if(n<min){
                min = n;
            }
        }
        int[] freq= new int[max-min + 1];
        for(int n:nums){
            if(n%2==0){
                freq[n-min]++;
            }
        }
        int maxAppearance = 0, minEven = -1;
        for(int i=0; i<freq.length; i++){
            if((i+min) % 2 == 0 && freq[i]> maxAppearance){
                maxAppearance = freq[i];
                minEven = i+min;
            }
        }
        return minEven;
    }
    public static void main(String[] args){
        int[] list={29, 47, 21, 41, 13, 37, 25, 7}; //Expected : -1 , because there is no even value in the list 
        System.out.println(mostFrequentEven(list));
    }
}