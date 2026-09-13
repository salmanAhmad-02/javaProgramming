class LeetProblem2119{
	public static boolean isSameAfterReversals(int num){
		//check if num==0, if true then return true and if number is not 0, then check if it's last digit is NOT equal to 0,if yes then return true..
		return num==0 || num%10 !=0;
	}
	public static void main(String[] args){
		int num1=614;
		int num2=1250;
		int num3=525;

		if(isSameAfterReversals(num1))
			System.out.println("Number will be Same afetr double Reversal For : "+num1);
		else
			System.out.println("Number will be Differnt afetr double Reversal For : "+num1);

		if(isSameAfterReversals(num2))
			System.out.println("Number will be Same afetr double Reversal For : "+num2);
		else
			System.out.println("Number will be Differnt afetr double Reversal For : "+num2);

		if(isSameAfterReversals(num3))
			System.out.println("Number will be Same afetr double Reversal For : "+num3);
		else
			System.out.println("Number will be Differnt afetr double Reversal For : "+num3);
	}
}