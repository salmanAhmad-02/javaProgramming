class Program1{

	public static void checkPrime(){
		System.out.println("checkPrime method starts");
		add();
		System.out.println("checkPrime method ends");
	}

	public static void main(String[] args){
		System.out.println("Program starts");
		add();
		checkPrime();
		System.out.println("Program Ends");
	}

	public static void add(){
		System.out.println("This is add method");
	}
}
