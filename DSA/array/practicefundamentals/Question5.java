// print and count all three-digit numbers from array.
class Question5{
    public static boolean isThreeDigits(int n){
        return (n >= 100 && n <= 999) || (n >= -999 && n <= -100);
    }
    public static void printAndCountThreeDigitNumbersInArray(int[] arr){
        int count=0;
        for(int n:arr){
            if(isThreeDigits(n)){
                System.out.print(n+" ");
                count +=1;
            }
        }
        System.out.println("\nTotal 3 Digit Numbers in Array are : "+count);
    }
    public static void main(String[] args){
        int[] nums={4, 72, 8, 305, 1492, 9, 81, 7063, 402, 9810};
        printAndCountThreeDigitNumbersInArray(nums);
    }
}