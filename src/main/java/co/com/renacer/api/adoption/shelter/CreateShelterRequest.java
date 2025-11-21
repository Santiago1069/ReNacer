package co.com.renacer.api.adoption.shelter;

import co.com.renacer.adoption.shelter.domain.models.ShelterType;
import co.com.renacer.commons.base_types.Email;
import co.com.renacer.commons.base_types.Phone;
import co.com.renacer.commons.base_types.Url;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Year;

public class CreateShelterRequest {
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
}

