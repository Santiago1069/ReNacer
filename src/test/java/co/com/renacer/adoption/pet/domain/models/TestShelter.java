package co.com.renacer.adoption.pet.domain.models;

import co.com.renacer.adoption.shelter.domain.models.Shelter;
import co.com.renacer.adoption.shelter.domain.models.ShelterType;
import co.com.renacer.commons.Email;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Test;

import java.time.Year;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestShelter {

    @Test
    public void shouldFailWhenFieldsAreInvalid() {

        try {
            Shelter shelter = new Shelter(
                    null,
                    null,
                    Email.of("email@email.com"),
                    "Cualquiera",
                    Year.of(2002),
                    ShelterType.FOUNDATION,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null
            );
            fail();
        } catch (ConstraintViolationException e) {
            assertEquals(2, e.getConstraintViolations().size());

            Set<String> fields = e.getConstraintViolations().stream()
                    .map(v -> v.getPropertyPath().toString())
                    .collect(Collectors.toSet());

            assertEquals(Set.of("name", "description"), fields);

        }
    }

}
