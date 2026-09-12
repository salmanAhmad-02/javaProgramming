class Program6{
	public static void printDigits(int x){
		while(x>0){
			int digit=x%10;
			System.out.println(digit+"\n");
			x /=10;
		}
	}
	public static void main(String[] args){
		int num=43705;
		System.out.println("Input Number : "+num);
		printDigits(num);
	}
}