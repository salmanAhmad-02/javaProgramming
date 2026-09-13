class LeetProblem231{
	public static boolean isPowerOfTwo(int num) {
		//return false if number is 0 or nagative
		if(num<=0)
			return false;
		//loop run till number is even
		while(num%2==0){
			//divide the number with 2 and store(update) the number
			num /=2;
		}
		//return true when number became 1 after division by 2 for all nubers that are in power of two
		return num==1;
	}
	public static void main(String[] args){
		int n1=1;
		int n2=7;
		int n3=6;
		int n4=1024;

		if(isPowerOfTwo(n1)){
			System.out.println(n1+" Number is in power of two");
		}
		else{
			System.out.println(n1+" Number is NOT in power of two");
		}

		if(isPowerOfTwo(n2)){
			System.out.println(n2+" Number is in power of two");
		}
		else{
			System.out.println(n2+" Number is NOT in power of two");
		}

		if(isPowerOfTwo(n3)){
			System.out.println(n3+" Number is in power of two");
		}
		else{
			System.out.println(n3+" Number is NOT in power of two");
		}

		if(isPowerOfTwo(n4)){
			System.out.println(n4+" Number is in power of two");
		}
		else{
			System.out.println(n4+" Number is NOT in power of two");
		}
	}
}