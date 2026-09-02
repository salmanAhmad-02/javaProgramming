class Swap2{
	public static void main(String[] args){
		int a=50;
		int b=27;
		System.out.println("a before swap is: "+a);
		System.out.println("b before swap is: "+b);
		System.out.println("===================");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a After swap is: "+a);
		System.out.println("b After swap is: "+b);
		
	}
}
