class Reverse2{
	public static void main(String[] args){

		int num1=15021;
		int num2=20221;
		int num3=121;
		int num4=1380;

		int rev1=getReverse(num1);
		int rev2=getReverse(num2);
		int rev3=getReverse(num3);
		int rev4=getReverse(num4);

		System.out.println("Reverse of "+num1+" is : "+rev1);
		System.out.println("Reverse of "+num2+" is : "+rev2);
		System.out.println("Reverse of "+num3+" is : "+rev3);
		System.out.println("Reverse of "+num4+" is : "+rev4);
		
	}
	public static int getReverse(int n){
		int rev=0;
		while(n>0){
			rev=rev*10+n%10;
			n /=10;
		}
		return rev;
	}
}
