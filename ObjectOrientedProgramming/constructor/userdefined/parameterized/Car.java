public class Car{

	String name;
	int hp;

	public Car(String name, int hp){
		this.name = name;
		this.hp = hp;

	}
    public String getDetails(){
		return "Car Name : "+name+"\tHP : "+hp;
	}
}