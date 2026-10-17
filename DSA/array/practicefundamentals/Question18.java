// WAJP to print all palindrome numbers available in array.
class Question18{
    public static boolean isPalindrome(int n){
        int rev=0; int org=n;
        if(n<0)
            return false;
        while(n>0){
            rev=rev*10+(n%10);
            n /=10;
        }
        return rev==org;
    }
    public static void printPalindromesInArray(int[] arr){
        boolean foundPalindrome=false;
        if(arr==null || arr.length==0){
            System.out.println("Empty Array or Null");
            return;
        }
        System.out.println("All Palindrome Numbers In Array Are : ");
        for(int n:arr){
            if(isPalindrome(n)){
                System.out.print(n+" ");
                foundPalindrome=true;
            }
        }
        if(!foundPalindrome){
            System.out.println("No Palindrome Numbers Found");
        }
    }
    public static void main(String[] args){
        int[] nums={4, 11, 12, 15, 19, 121, 23, 28,89, 30};
        printPalindromesInArray(nums);
    }
}