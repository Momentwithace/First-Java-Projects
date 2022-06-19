package Chapter11;

public class MyException extends RuntimeException{
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
    public MyException(Throwable error){
        super(error);
    }
    public MyException(String message, Throwable error){
        super(message, error);
    }

}
