package co.com.renacer.adoption.shelter.domain.models;

import co.com.renacer.commons.Email;
import co.com.renacer.commons.validations.ValidatorUtils;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Year;

public class Shelter {
    @NotEmpty @Size(min = 3, max = 100)
    String name;
    @NotEmpty @Size(min = 10, max = 500)
    String description;
    @NotNull
    Email email;
    // TODO: crear value object para representar un phone (Telefono) debería ser obligatorio
    // TODO: crear value object para representar una URL  (Sitio web) opcional
    @NotEmpty @Size(max = 200)
    String address;
    @NotNull
    Year foundationYear;
    @NotNull
    ShelterType type;

    String facebookProfile;
    String instagramProfile;
    String twitterProfile;
    // Cover image represents a local/relative path.
    String coverImagePath;
    // Logo path represents a local/relative path.
    String logoPath;
    @Min(value = 0)
    int averageRating;
    @Min(value = 0)
    int petsAvailable;
    String schedule;

    public Shelter(
        String name,
        String description,
        Email email,
        String address,
        Year foundationYear,
        ShelterType type,
        String facebookProfile,
        String instagramProfile,
        String twitterProfile,
        String coverImagePath,
        String logoPath,
        String schedule
    ) {

        this.name = name;
        this.description = description;
        this.email = email;
        this.address = address;
        this.foundationYear = foundationYear;
        this.type = type;
        this.facebookProfile = facebookProfile;
        this.instagramProfile = instagramProfile;
        this.twitterProfile = twitterProfile;
        this.coverImagePath = coverImagePath;
        this.logoPath = logoPath;
        this.schedule = schedule;

        ValidatorUtils.validateOrThrow(this);
    }
}


