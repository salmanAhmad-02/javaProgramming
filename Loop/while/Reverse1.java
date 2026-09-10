class Reverse1{
	public static void main(String[] args){
		int n1=235;
		int n2=705;
		int n3=8009;
		int n4=8010;

		printReverse(n1);
		printReverse(n2);
		printReverse(n3);
		printReverse(n4);
	}
	public static void printReverse(int n){
		int num=n;
		int rev=0;
		while(n>0){
			int digit=n%10;
			rev=10*rev+digit;
			n/=10;
		}
		System.out.println("Reverse of "+num+" is: "+rev);
	}
}