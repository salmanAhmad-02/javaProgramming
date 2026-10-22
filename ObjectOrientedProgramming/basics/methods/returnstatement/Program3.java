class Program2{

	public static void main(String[] args){
		int res=test(25);
		System.out.println("Returned value is: "+res);
	}

    //  Valid  : for any value either it will go in if "true" , in false case outside if will be executed 
	public static int test(int n){
		if(n>10){
			return 15;
		}
		return 5;
	}	
}