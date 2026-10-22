class Program1{

	public static void main(String[] args){
		int res=test(25);
		System.out.println("Returned value is: "+res);
	}

    //  will lead compilation error : missing return statement
	public static int test(int n){
		if(n>10){
			return 15;
		}
	}	
}