class Palindrome{
	public static void main(String[] args){
		int num1=13531;
		
		if(isPalindrome(num1))
			System.out.println(num1+" is Palindrome");
		else
			System.out.println(num1+" is not Palindrome");
	}
	public static boolean isPalindrome(int x){
		int rev=0;	int n=x;
		while(x>0){
			rev=rev*10+(x%10);
			x /=10;
		}
		return n==rev;
	}
}