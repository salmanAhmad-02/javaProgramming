class Calculate1{

	public static int getSum(int a, int b){
		int sum=a+b;
		System.out.println("Sum of "+a+" and "+b+" is: "+sum);
		return sum;
	}

	public static void main(String[] args){
		int sum1=getSum(20, 30);
		int a=40, b=60;
		int sum2=getSum(a, b);
		int n1=55, n2=66;
		int sum3=getSum(n1, n2);
		int totalSum=sum1+sum2+sum3;
		System.out.println("Total SUm is: "+totalSum);
	}	
}