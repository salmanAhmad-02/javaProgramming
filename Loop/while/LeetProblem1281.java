//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//Constraints: 1 <= n <= 10^5
class LeetProblem1281 {

	public static int subtractProductAndSum(int n) {
		int product=1;
        	int sum=0;
        	while(n>0){
			int digit=n%10;
			product=product*digit;
			sum =sum+digit;
			n /=10;
		}
		return (product - sum);
	}
	public static void main(String[] args){
		int n1 = 234;
		int n2 = 4421;
		
		System.out.println("diff 1: "+subtractProductAndSum(n1));
		System.out.println("diff 2:"+subtractProductAndSum(n2));
	}
}