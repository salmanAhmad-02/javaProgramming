// Program to check charecter is alphanumeric or a special charecter
class Program2{
	public static void main(String[] args){
		char c='a';
		if((c>='A' && c<='Z')||(c>='a' && c<='z')||(c>='0' && c<='9'))
			System.out.println(c+" is alphanumeric charecter");
		else
			System.out.println(c+" is a special charecter");
	}
}