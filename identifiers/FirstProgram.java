class FirstProgram{

	public static void checkPrime(){
		System.out.println("checkPrime method starts");
		System.out.println("checkPrime method ends");
	}

	public static void main(String[] args){
		add();
		System.out.println("Program starts");
		System.out.println(12+40*5);
		System.out.println(12+40*8);
		add();
		checkPrime();
		add();
		System.out.println("Program Ends");
	}

	public static void add(){
		System.out.println("This is add method");
	}
}
