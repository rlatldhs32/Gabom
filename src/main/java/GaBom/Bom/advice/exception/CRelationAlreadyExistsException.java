package GaBom.Bom.advice.exception;

public class CRelationAlreadyExistsException extends RuntimeException{

    public CRelationAlreadyExistsException(String msg, Throwable t) {
        super(msg, t);
    }

    public CRelationAlreadyExistsException(String msg) {
        super(msg);
    }

    public CRelationAlreadyExistsException(){
        super();
    }

}
