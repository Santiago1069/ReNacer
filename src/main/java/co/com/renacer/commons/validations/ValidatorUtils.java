package co.com.renacer.commons.validations;

import jakarta.validation.*;

import java.util.Set;

public class ValidatorUtils {

    public static <T> void validateOrThrow(T object) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> violations = validator.validate(object);

        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }

}
