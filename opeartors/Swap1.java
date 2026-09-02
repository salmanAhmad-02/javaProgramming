class Swap1{
	public static void main(String[] args){
		int a=45;
		int b=33;
		System.out.println("a before swap is: "+a);
		System.out.println("b before swap is: "+b);
		System.out.println("===================");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a After swap is: "+a);
		System.out.println("b After swap is: "+b);
		
	}
}
