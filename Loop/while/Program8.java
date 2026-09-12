/* Write a java program to take a user input 
* and print the biggest digit of the number.
*/
class Program8{
	public static void main(String[] args){
		int n1=43705;
		System.out.println("Entered number is : "+n1);
		printBiggestDigit(n1);
	}
	public static void printBiggestDigit(int num){
		int biggest=0;
		while(num>0){
			int digit=num%10;
			if(digit>biggest)
				biggest=digit;
			num /=10;
		}
		System.out.println("Biggest digit is : "+biggest);
	}
}
