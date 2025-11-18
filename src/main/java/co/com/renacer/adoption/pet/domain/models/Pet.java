package co.com.renacer.adoption.pet.domain.models;

import java.time.LocalDate;
import java.util.UUID;

// TODO: Agregar validaciones a los campos
// Crear constructor y validar modelo
// Crear prueba unitaria
public class Pet {
    UUID id;
    Breed breed;
    String name;
    LocalDate birthDate; // Opcional
    AnimalGender gender;
    PetType type;
    PetSize size;
    String history; // Opcional
    String personalityDescription; // Opcional
    String photo;
    boolean is_sterilized;
    boolean is_vaccinated;
    PetStatus status;
    int views = 0;
    int applications = 0;
    UUID shelterId;
}
