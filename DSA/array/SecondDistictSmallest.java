// WAP to print Second Distict Smallest element of the array.
class SecondDistictSmallest{
    public static int getSecondSmallestUniqueElement(int [] nums){
        // Step 1: Guard against missing or empty input array
        if(nums == null || nums.length==0){
            return -1;
        }
        // Step 2: Guard against arrays without enough elements for a 2nd smallest
        if(nums.length==1){
            return -1;
        }
        int small=Integer.MAX_VALUE;
        int secSmall=Integer.MAX_VALUE;

        for(int n:nums){
            if(n<small){
                secSmall=small;
                small=n;
            }
            else if(n<secSmall && n!=small){
                secSmall=n;
            }
        }
        return secSmall;
    }
    public static void main(String[] args){
        int[] arr={80, 80, 43, 50, 38, 63, 38, 80};
        int secondSmall=getSecondSmallestUniqueElement(arr);        // O/P - 43

        if(secondSmall<0){
            System.out.println("Emty Array or Single Indexed Array ! ");
        }
        else{
            System.out.println("Second Smallest Element is : "+secondSmall);
        }
    }
}