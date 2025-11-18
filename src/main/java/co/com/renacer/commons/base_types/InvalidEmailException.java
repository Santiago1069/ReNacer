package co.com.renacer.commons.base_types;

public class InvalidEmailException extends RuntimeException{

    private String email;

    public InvalidEmailException(String email) {
        super("Email invalid " + email);
        this.email = email;
    }
}
