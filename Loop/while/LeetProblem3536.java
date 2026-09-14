class LeetProblem3536{
	public static int maxProduct(int n) {
        	int firstD=0; int secondD=0;
        	while(n>0){
			int digit=n%10;
			if(digit>=firstD){
				secondD=firstD;
				firstD=digit;
			}
			else if(digit>secondD){
				secondD=digit;
			}
			n /=10;
		}
	return firstD*secondD;
	}
	public static void main(String[] args){
		int n1=124;
		int n2=122;
		int n3=31;

		int maxProd1=maxProduct(n1);
		int maxProd2=maxProduct(n2);
		int maxProd3=maxProduct(n3);
		
		System.out.println("Maximum product of digits in number "+n1+" is : "+maxProd1);
		System.out.println("Maximum product of digits in number "+n2+" is : "+maxProd2);
		System.out.println("Maximum product of digits in number "+n3+" is : "+maxProd3);
	}
}