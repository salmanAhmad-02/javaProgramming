class Program4{
	public static void main(String[] args){
		//Some important methods and featues of String class
		String s1="Salman";
		String s2="salman";
		
		//equals(string)
		System.out.println(s1.equals(s2));

		//equalsIgnoreCase(string)
		System.out.println(s1.equalsIgnoreCase(s2));

		//toUpperCase()
		System.out.println(s2.toUpperCase());

		//toLowerCase()
		System.out.println(s1.toLowerCase());

		//codePointAt(int index) return ascii value of that charecter at given index.
		System.out.println(s1.codePointAt(1));
	}
	
}
