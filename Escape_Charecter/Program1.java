class Program1{
	public static void main(String[] args){
		System.out.println("\"Mohan and \"Sohan\" are here\"");
		System.out.println("\"");
		System.out.println('"');
		System.out.println("'");
		System.out.println('\'');

		//-\t- to generate a tab sapce
		System.out.println("Today is\t Monday");

		//-\n- to bring cursor to new line 
		System.out.println("Here is \nSalman Ahmad");

		/* You can't put anything afetr \ , like 
		System.out.println("John and \Jack\ are here"); will raise an error , illegal Escape charecter */
		
		//if you want to use \ into your output console then you must do like this (use one more \ before anfer that \) 
		System.out.println("John and \\Jack\\ are here");
	}
}