// WAJP to count all palindrome numbers available in array.
class Question19{
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
    public static void countPalindromeNumbers(int[] arr){
        int count=0;
        if(arr==null || arr.length==0){
            System.out.println("Empty or Null Array!");
            return;
        }
        for(int n:arr){
            if(isPalindrome(n)){
                count++;
            }
        }
        System.out.println("Total Palindrome Numbers Present Are : "+count);
    }
    public static void main(String[] args){
        int[] nums={4, 11, 12, 15, 19, 121, 23, 28,89, 30};
        countPalindromeNumbers(nums);
    }
}