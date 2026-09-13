class LeetProblem3783 {
	public static int getMirrorDistance(int n) {
		int mirrorDistance=0; int rev=0; int org=n;
		while(n>0){
			rev=rev*10+(n%10);
			n /=10;
		}
		mirrorDistance=org-rev;
		return mirrorDistance<0?-mirrorDistance:mirrorDistance;
	}
	public static void main(String[] args){
		int num1=10;	//9
		int num2=25;	//27
		
		System.out.println("Mirror Distance of Number "+num1+" is : "+getMirrorDistance(num1));
		System.out.println("Mirror Distance of Number "+num2+" is : "+getMirrorDistance(num2));
	}
	
}