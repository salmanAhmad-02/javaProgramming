class EmployDriver{

	public static void main(String[] args){
		Employ e1=new Employ();
		Employ e2=new Employ();
		Employ e3=new Employ();

		e1.setDetails("Aasim", 23, 21000);
		e2.setDetails("Sahil", 26, 28000);
		e3.setDetails("Sameer", 20, 20000);
 
		System.out.println(e1.getDetails());
		System.out.println(e2.getDetails());
		System.out.println(e3.getDetails());
		System.out.println("===================");

        // Passing refrence of the object, to modify object value 'salary' - that is example of call by refrence 
		Service.incrementSalary(e2, 8000);
		Service.incrementSalary(e1, 5000);

        // Passing refrence of the object, to modify object value 'name' - that is example of call by refrence
		Service.updateName(e1, "Mark");

		System.out.println(e1.getDetails());
		System.out.println(e2.getDetails());
		System.out.println(e3.getDetails());

	}	
}