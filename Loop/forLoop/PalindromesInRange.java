class PalindromesInRange{
    public static boolean isPalindrome(int n){
        int rev=0;  int num=n;
        if(n<0)
            return false;
        else if(n==0)
            return true;
        while(n>0){
            rev=rev*10+(n%10);
            n /=10;
        }
        return rev==num;
    }
    public static void printAndCountPalindromeNumbers(int start, int end){
        int count=0;
        for(int i=start; i<=end; i++){
            if(isPalindrome(i)){
                System.out.print(i+" ");
                count +=1;
            }
        }
         System.out.println("\nTotal Palindrome Numbers In Range "+start+" To "+end+" are : "+count);
    }
    public static void main(String[] args){
        int st=1;
        int end=100;
        printAndCountPalindromeNumbers(st,end);
    }
}