class MaxMin1{
	public static void main(String[] args){
		//Decimal Number
		int n=2354361;
		int max=0, min=9;
		while(n>0){
			//extract the last digit of n
			int digit=n%10;
			if(digit>max)	max=digit;
			if(digit<min)	min=digit;
			//drop the last digit 
			n/=10;
		}
		System.out.println("Biggest Digit is: "+max);
		System.out.println("Smallest Digit is: "+min);
	}
}