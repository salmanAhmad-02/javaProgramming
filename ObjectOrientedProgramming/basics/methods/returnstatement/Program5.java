class Program4{

	public static void main(String[] args){
		System.out.println(getSum(13, 78));
        System.out.println(getSum(90, 6));
	}
	public static int getSum(int a, int b){
		int sum = a + b;
		return sum;
		System.out.println("Sum of "+a+" and "+b+" is : "+sum);	 //error: unreachable statement
	}
}