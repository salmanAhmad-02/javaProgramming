//Second Maximum among three nubers
class Program4{
	public static void main(String[] args){
		int a=65;
		int b=98;
		int c=67;
		
		int max=(a>b) ? (a>c?a:c) : (b>c?b:c);
		int min=(a<b) ? (a<c?a:c) : (b<c?b:c);

		int secondMax=(a + b + c)-(max + min);
		System.out.println("Second Maximum number is :"+secondMax);
	}
}
