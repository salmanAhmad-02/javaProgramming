public class Solution {

	public static void main(String[] args) {
		int result = devide(-2147483648, -1);
        System.out.println(" Quotient  = "+result);
	}
	public static int devide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
		long n = dividend, x = divisor;
		if(n < 0){
            n = -n;
        }
        if(x < 0){
            x = -x;
        }
        long q=0;
        for(long i = x; i <= n ; i += x){
            q++;
        }
        if( dividend < 0 && divisor < 0 || dividend > 0 && divisor > 0 ){
            return (int) q;
        }
		return (int) -q;
	}
}