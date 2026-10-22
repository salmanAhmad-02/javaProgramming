class Program2{

	public static void main(String[] args){
		int res=test(25);
		System.out.println("Returned value is: "+res);
	}

    //  No error : for any value either it will go in if "true" case , false case will execute else 
	public static int test(int n){
		if(n>10){
			return 15;
		}else{
			return 5;
		}
	}	
}