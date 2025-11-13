package co.com.renacer.commons;

public class InvalidEmailException extends RuntimeException{

    private String email;

    public InvalidEmailException(String email) {
        super("Email invalid " + email);
        this.email = email;
    }
}
