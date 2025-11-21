package co.com.renacer.api.adoption.shelter;

import co.com.renacer.adoption.shelter.domain.models.Shelter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
public class ShelterController {

    @PostMapping("/v1/adoption/shelter")
    public void create(@RequestBody CreateShelterRequest request) {
        Shelter shelter = new Shelter(
                request.name,
                request.description,
                request.email,
                request.phone,
                request.url,
                request.address,
                request.foundationYear,
                request.type,
                request.facebookProfile,
                request.instagramProfile,
                request.twitterProfile,
                request.coverImagePath,
                request.logoPath,
                request.schedule,
                LocalDateTime.now()
        );


    }

}
