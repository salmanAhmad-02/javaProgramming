//Max of three
class Program2{
	public static void main(String[] args){
		int a= 45  , b= 55  , c=  35 ;

		int max=(a>b) ? (a>c?a:c) : (b>c?b:c);

		System.out.println("Biggest is : "+max);
		
	}
}
