public class Program3{
    public static void main(String[] args){

		String name=IO.readln("Enter the Name: ");
		int age=Integer.parseInt(IO.readln("Enter the Age: "));
		double weight=Double.parseDouble(IO.readln("Enter the Weight: "));
		char gender=IO.readln("Enter the Gender: ").charAt(0);

		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Weight is: "+weight);
		System.out.println("Gender is: "+gender);

	}
}