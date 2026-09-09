//Program to count sum of digits
class DigitSum{
	public static void main(String[] args){
		int n=235436;
		int sum=0;
		while(n>0){
			//extract last digit 
			int digit=n%10;
			//add it in sum 
			sum+=digit;
			//drop the last digit 
			n/=10;
		}
		System.out.println("Total Digit Sum is: "+sum);

		
	}
}