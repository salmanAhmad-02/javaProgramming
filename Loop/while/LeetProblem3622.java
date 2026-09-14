class LeetProblem3622{
	public static void main(String[] args){
		int num1=99;
		int num2=23;

		if(checkDivisibility(num1))
			System.out.println(num1+" is divisble by it's sum and product");
		else
			System.out.println(num1+" is NOT divisble by it's sum and product");

		if(checkDivisibility(num2))
			System.out.println(num2+" is divisble by it's sum and product");
		else
			System.out.println(num2+" is NOT divisble by it's sum and product");
	}
	public static boolean checkDivisibility(int n) { 
		int sum=0; int product=1; int org=n;
		while(n>0){
			int digit=n%10;
			sum=sum+digit;
			product=product*digit;
			n /=10;
		}
		return org % (sum + product) == 0;
	}
}