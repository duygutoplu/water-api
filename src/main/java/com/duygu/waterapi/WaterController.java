package com.duygu.waterapi;


import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WaterController {

    private List<WaterIntake> waterList = new ArrayList<>();
    private int currentId = 1;

    @GetMapping("/water")
    public List<WaterIntake> getWater() {
        return waterList;
    }
}