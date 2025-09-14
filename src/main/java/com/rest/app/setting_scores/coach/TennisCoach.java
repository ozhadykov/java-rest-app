package com.rest.app.setting_scores.coach;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("Tennis Coach Initialzing");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for tennis";
    }
}
