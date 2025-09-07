package com.rest.app.setting_scores.coach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice for tennis";
    }
}
