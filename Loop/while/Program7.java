/* Write a java program to take a user input 
* and print each even digits of the number one by one.
*/
class Program7{
	public static void printEvenDigits(int x){
		while(x>0){
			int digit=x%10;
			if(digit%2==0)
				System.out.println("\n Even Digit :"+digit);
			x /=10;
		}
	}
	public static void main(String[] args){
		int num=43705;
		System.out.println("Entered Number : "+num);
		printEvenDigits(num);
	}
}	 