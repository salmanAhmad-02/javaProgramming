package custom2;

public class UserDriver{
    public static void main(String[] args) {

        User u101=null;
        try{
            u101 = new User("     ", 20);
        }catch(IllegalAgeException e){
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        try{
            if(u101 == null){
                throw new ObjectNotFoundException("User Not Found");
            }
            System.out.println();
        }
        catch(ObjectNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Main Thread Ends....");
    }
}