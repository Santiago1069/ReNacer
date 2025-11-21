package co.com.renacer.adoption.pet.domain.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class TestPet {

    @Test
    public void shouldCreatePetSuccessfully(){
        Pet pet = new Pet(
                new Breed("Pastor Aleman"),
                LocalDate.now(),
                "Zeus",
                AnimalGender.MALE,
                PetType.DOG,
                PetSize.BIG,
                null,
                null,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Cane_da_pastore_tedesco_adulto.jpg/330px-Cane_da_pastore_tedesco_adulto.jpg",
                true,
                true,
                PetStatus.ENABLED,
                0,
                0,
                UUID.randomUUID(),
                LocalDateTime.now()
        );

        assertNotNull(pet);

        assertEquals("Zeus", pet.name);
        assertEquals("Pastor Aleman", pet.breed.name);
        assertEquals(AnimalGender.MALE, pet.gender);
        assertEquals(PetType.DOG, pet.type);
        assertEquals(PetSize.BIG, pet.size);
        assertEquals(LocalDate.now(), pet.birthDate);
        assertEquals("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Cane_da_pastore_tedesco_adulto.jpg/330px-Cane_da_pastore_tedesco_adulto.jpg", pet.photo);
        assertTrue(pet.is_sterilized);
        assertTrue(pet.is_vaccinated);
        assertEquals(PetStatus.ENABLED, pet.status);
        assertEquals(0, pet.views);
        assertEquals(0, pet.applications);
    }
}
