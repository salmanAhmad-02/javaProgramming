class Palindrome{
	public static void main(String[] args){
		int num1=13531;
		
		if(isPalindromeNumber(num1))
			System.out.println("'" + num1 + "' is Palindrome Number");
		else
			System.out.println("'" + num1 + "' is not Palindrome Number");
		
		String s1="madam";
		if(isPalindromeString(s1))
			System.out.println("\"" + s1 + "\" is Palindrome String");
		else
			System.out.println("\"" + s1 + "\" is not Palindrome String");
	}
	public static boolean isPalindromeNumber(int x){
		int rev=0;	int n=x;
		while(x>0){
			rev=rev*10+(x%10);
			x /=10;
		}
		return n==rev;
	}
	public static boolean isPalindromeString(String s){
		if (s == null) return false;
		String revString="";
		int i = s.length() - 1;
		while (i >= 0) {
			revString +=s.charAt(i);
			i--;
		}
		return s.equals(revString);
	}
}