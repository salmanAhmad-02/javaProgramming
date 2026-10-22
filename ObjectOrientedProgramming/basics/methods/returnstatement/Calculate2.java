class Calculate2{

	public static int getSum(int a, int b){
		int sum=a+b;
		System.out.println("Sum of "+a+" and "+b+" is: "+sum);
		return sum;
	}

	public static void main(String[] args){
		int a=40, b=60;
		int n1=55, n2=66;
		System.out.println("Total Sum is: "+(getSum(20, 30)+getSum(a, b)+getSum(n1, n2)));
	}	
}