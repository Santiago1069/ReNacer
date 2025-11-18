package co.com.renacer.adoption.pet.domain.models;

import co.com.renacer.adoption.shelter.domain.models.Shelter;
import co.com.renacer.adoption.shelter.domain.models.ShelterType;
import co.com.renacer.commons.base_types.Email;
import co.com.renacer.commons.base_types.Phone;
import co.com.renacer.commons.base_types.Url;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TestShelter {

    @Test
    public void shouldFailWhenFieldsAreInvalid() {

        try {
            Shelter shelter = new Shelter(
                    null,
                    null,
                    Email.of("email@email.com"),
                    new Phone("+57", "3166953158"),
                    new Url("https://google.com"),
                    "Cualquiera",
                    Year.of(2002),
                    ShelterType.FOUNDATION,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    LocalDateTime.now()
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

    @Test
    public void shouldCreateShelterSuccessfully(){
        Shelter shelter = new Shelter(
            "Huellas aqui",
            "Somos una fundacion para ayudar",
            Email.of("email@email.com"),
            new Phone("+57", "3166953158"),
            new Url("https://google.com"),
            "Cualquiera",
            Year.of(2002),
            ShelterType.FOUNDATION,
            null,
            null,
            null,
            null,
            null,
            null,
            LocalDateTime.now()
        );

        assertNotNull(shelter);

        assertEquals("Huellas aqui", shelter.name);
        assertEquals("Somos una fundacion para ayudar", shelter.description);
        assertEquals(Email.of("email@email.com"), shelter.email);
        assertEquals(new Phone("+57", "3166953158"), shelter.phone);
        assertEquals(new Url("https://google.com"), shelter.url);
        assertEquals("Cualquiera", shelter.address);
        assertEquals(Year.of(2002), shelter.foundationYear);
        assertEquals(ShelterType.FOUNDATION, shelter.type);
    }

}
