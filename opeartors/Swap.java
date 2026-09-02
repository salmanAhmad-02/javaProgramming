class Swap{
	public static void main(String[] args){
		int a=45;
		int b=33;
		System.out.println("a before swap is: "+a);
		System.out.println("b before swap is: "+b);
		System.out.println("===================");
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a After swap is: "+a);
		System.out.println("b After swap is: "+b);
		
	}
}
