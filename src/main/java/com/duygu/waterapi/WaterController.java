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

    @PostMapping("/water")
    public WaterIntake addWater(@RequestBody WaterIntake water) {
        WaterIntake newWater = new WaterIntake(
            currentId++,
            water.getAmount(),
            water.getDate()
        );

        waterList.add(newWater);
        return newWater;
    }

    @DeleteMapping("/water/{id}")
    public String deleteWater(@PathVariable int id) {
        waterList.removeIf(w -> w.getId() == id);
        return "Deleted";
    }
}