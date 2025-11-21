package co.com.renacer.adoption.pet.domain.models;

import co.com.renacer.commons.base_types.Aggregate;
import co.com.renacer.commons.validations.ValidatorUtils;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Pet extends Aggregate {
    @NotNull
    UUID id;
    @NotNull
    Breed breed;
    @NotNull @Size(min = 3, max = 100)
    String name;
    LocalDate birthDate; // Opcional
    @NotNull
    AnimalGender gender;
    @NotNull
    PetType type;
    @NotNull
    PetSize size;
    String history; // Opcional
    String personalityDescription; // Opcional
    @NotNull
    String photo;
    @NotNull
    boolean is_sterilized;
    @NotNull
    boolean is_vaccinated;
    @NotNull
    PetStatus status;
    @Min(value = 0)
    int views = 0;
    @Min(value = 0)
    int applications = 0;
    @NotNull
    UUID shelterId;

    public Pet(
            Breed breed,
            LocalDate birthDate,
            String name,
            AnimalGender gender,
            PetType type,
            PetSize size,
            String history,
            String personalityDescription,
            String photo,
            boolean is_sterilized,
            boolean is_vaccinated,
            PetStatus status,
            int views,
            int applications,
            UUID shelterId,
            LocalDateTime now
    ) {
        this.id = UUID.randomUUID();
        this.breed = breed;
        this.birthDate = birthDate;
        this.name = name;
        this.gender = gender;
        this.type = type;
        this.size = size;
        this.history = history;
        this.personalityDescription = personalityDescription;
        this.photo = photo;
        this.is_sterilized = is_sterilized;
        this.is_vaccinated = is_vaccinated;
        this.status = status;
        this.views = views;
        this.applications = applications;
        this.shelterId = shelterId;

        this.creationDate = now;
        this.lastUpdateDate = now;

        ValidatorUtils.validateOrThrow(this);
    }
}

