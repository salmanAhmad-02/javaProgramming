class Service{
    // this method requires refrence(addrees) of the object of Employ to modify exact object 'salary'
	public static void incrementSalary(Employ x, int increment){
		x.salary=x.salary+increment;
	}
    // this method requires refrence(addrees) of the object of Employ to modify exact object 'name'
	public static void updateName(Employ x, String name){
		x.name=name;
	}					
}