package com.duygu.waterapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    private Profile profile;

    @GetMapping("/profile")
    public Profile getProfile() {
        return profile;
    }

    @PostMapping("/profile")
    public Profile saveProfile(@RequestBody Profile profile) {
        this.profile = new Profile(
            profile.getAge(),
            profile.getHeightCm(),
            profile.getWeightKg(),
            profile.getPreferredWaterUnit()
        );

        return this.profile;
    }
}
