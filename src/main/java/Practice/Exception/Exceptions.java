package Practice.Exception;

public class Exceptions extends Exception {
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class Inputnotnull extends RuntimeException{

    public Inputnotnull(String message) {
        super(message);
    }
}

class AgeIsNotValid extends Exception{
    AgeIsNotValid (String message){
        super(message);
    }
}