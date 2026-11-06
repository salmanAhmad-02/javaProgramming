package custom2;
/**
 * ObjectNotFoundException
 */
public class ObjectNotFoundException extends RuntimeException{
    /*
        Constructor takes the message and pass to parent Class object
    */
    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
