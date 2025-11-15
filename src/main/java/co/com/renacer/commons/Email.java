package co.com.renacer.commons;

import java.util.Objects;
import java.util.regex.Pattern;


public class Email {
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
        "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}$",
        Pattern.CASE_INSENSITIVE
    );

    String value;

    private Email(String value) {
        if (value == null || value.isBlank()) {
            throw new InvalidEmailException(value);
        }

        if (!EMAIL_PATTERN.matcher(value).matches()) {
            throw new InvalidEmailException(value);
        }

        this.value = value;
    }

    public static Email of(String value) {
        return new Email(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(value, email.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
