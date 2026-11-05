package custom2;

/**
 * Users
*/
public final class User{
    private String name;
    private int age;

    public User(String name, int age){
        setName(name);
        setAge(age);
    }
    public void setName(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be null or blank");
        }
        this.name = name;
    }
    public void setAge(int age){
        if(age < 0 || age > 150){
            throw new IllegalAgeException("Age must be between 0 and 150, but was " + age);
        }
        this.age = age;
    }
    public String getDetails(){
        return name+"\t"+age;
    }
}