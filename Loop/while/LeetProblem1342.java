//Number of Steps to reduce a number to zero
/* Given an integer num, return the number of steps to reduce it to zero.
*  In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
*/
class LeetProblem1342 {
	public static int numberOfSteps(int num) {
		int steps=0;
		while(num>0){
			if(num%2==0)
				num /=2;
			else
				num -=1;
			steps++;       
		}
		return steps;
	}
	public static void main(String[] args){
		int n1=14;	//6 steps
		int n2=123;	//12 steps

		System.out.println("Reqired Step to reduce number "+n1+" to zero is : "+numberOfSteps(n1));
		System.out.println("Reqired Step to reduce number "+n2+" to zero is : "+numberOfSteps(n2));
	}
}
