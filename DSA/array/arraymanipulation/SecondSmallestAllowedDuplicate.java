class SecondSmallestAllowedDuplicate{
    public static int getSecondMin(int[] nums){
        if(nums==null || nums.length < 2){
            return -1;
        }
        int min=Integer.MAX_VALUE, secMin=Integer.MAX_VALUE;
        for(int n:nums){
            if(n<min){
                secMin=min;
                min=n;
            }
            else if(n<secMin){
                secMin=n;
            }
        }
        /*
            program fail if the data in the array is equal to Integer.MAX_VALUE,or -1 
            (we can handle this using Long.MAX_VALUE or bool flags, or with wrapper calss Integer)
        */
        return (secMin == Integer.MAX_VALUE) ? -1 : secMin;  
    }
    public static void main(String[] args){
        int[] arr={80, 80, 43, 50, 38, 63, 38, 80 };
        Integer secondMinimun=getSecondMin(arr);        // O/P - 38

        if(secondMinimun== -1)
            System.out.println("Empty or null Array or Second Smallest does not exist!");
        else
            System.out.println("Second Smallest Element is : "+secondMinimun);
    }

}