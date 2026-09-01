class Program5{
	public static void main(String[] args){
		if(!args[0].equals("1234")){	
			System.out.println("Validation Failed! Application can't Start!!");
			System.exit(0);
		}

		System.out.println("Program starts");
		System.out.println("Array Size is: "+args.length);
		for(String s:args){
			System.out.println(s);
		}
		System.out.println("Program Ends");
	}
}
