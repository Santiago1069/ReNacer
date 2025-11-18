package co.com.renacer.adoption.shelter.domain.models;

import co.com.renacer.commons.base_types.Aggregate;
import co.com.renacer.commons.base_types.Email;
import co.com.renacer.commons.base_types.Phone;
import co.com.renacer.commons.base_types.Url;
import co.com.renacer.commons.validations.ValidatorUtils;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.UUID;

public class Shelter extends Aggregate {
    @NotNull
    UUID id;
    @NotEmpty @Size(min = 3, max = 100)
    public String name;
    @NotEmpty @Size(min = 10, max = 500)
    public String description;
    @NotNull
    public Email email;
    @NotNull
    public Phone phone;
    public Url url;
    @NotEmpty @Size(max = 200)
    public String address;
    @NotNull
    public Year foundationYear;
    @NotNull
    public ShelterType type;

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
        Phone phone,
        Url url,
        String address,
        Year foundationYear,
        ShelterType type,
        String facebookProfile,
        String instagramProfile,
        String twitterProfile,
        String coverImagePath,
        String logoPath,
        String schedule,
        LocalDateTime now
    ) {

        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.email = email;
        this.phone = phone;
        this.url = url;
        this.address = address;
        this.foundationYear = foundationYear;
        this.type = type;
        this.facebookProfile = facebookProfile;
        this.instagramProfile = instagramProfile;
        this.twitterProfile = twitterProfile;
        this.coverImagePath = coverImagePath;
        this.logoPath = logoPath;
        this.schedule = schedule;
        this.creationDate = now;
        this.lastUpdateDate = now;

        ValidatorUtils.validateOrThrow(this);
    }

}


