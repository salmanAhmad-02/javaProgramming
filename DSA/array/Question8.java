// WAJP to print and count all the elements of array which are bigger than average value.
class Question8{
    public static double getArrayAvg(int[] arr){
        int sum=0;
        for(int n:arr){
            sum +=n;
        }
        return (double)sum/arr.length;       //Returns Average
    }
    public static void printAndCountAboveAverage(int[] arr){
        double avgOfArray=getArrayAvg(arr);
        int count=0;
        for(int n:arr){
            if(n>avgOfArray){
                System.out.print(n+" ");
                count +=1;
            }
        }
        System.out.println("\nTotal Above Average, Elements Are : "+count);
    }
    public static void main(String[] args){
        int[] nums={4, 72, 8, 305, 1492, 9, 81, 7063, 402, 9810};
        printAndCountAboveAverage(nums);
    }
}