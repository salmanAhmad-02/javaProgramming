class MaxMin{
	public static void main(String[] args){
		//Octal base 
		int n=0322; //210 as decimal
		int max=n%10, min=n%10;
		while(n>0){
			int digit=n%10;
			if(digit>max)	max=digit;
			else if(digit<min)	min=digit;
			n/=10;
		}
		System.out.println("Biggest Digit is: "+max);
		System.out.println("Smallest Digit is: "+min);
	}
}
