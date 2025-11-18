package co.com.renacer.api.adoption.shelter;

import co.com.renacer.adoption.shelter.domain.models.Shelter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ShelterController {

    @PostMapping("/v1/adoption/shelter")
    public void create(@RequestBody CreateShelterRequest request) {
        // Shelter shelter = new Shelter();
        // TODO: crear el shelter
    }

}
