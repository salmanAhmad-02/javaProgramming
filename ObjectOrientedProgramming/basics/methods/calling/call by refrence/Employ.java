class Employ{
    String name;
    int age;
	double salary;

	public void setDetails(String name, int age, double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	public String getDetails(){
		return "Name is: "+name+"\tAge is: "+age+"\tSalary is: "+salary;
	}
}