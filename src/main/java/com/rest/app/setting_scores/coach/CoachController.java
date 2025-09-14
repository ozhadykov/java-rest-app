package com.rest.app.setting_scores.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    // define a private field for the depepndency
    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired
    public CoachController(
            @Qualifier("aquatic") Coach coach
    ) {
        System.out.println("in constructor: " + getClass().getSimpleName());
        myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String dailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
