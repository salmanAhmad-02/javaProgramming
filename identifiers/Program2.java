class Program2{

	public static void main(String[] args){
		System.out.println("Program starts");
		add();
		System.out.println("Program Ends");
	}

	public static void add(){
		System.out.println("This is add method");
		add();  //uncontroled self call will cause StackOverflowError
	}
}
